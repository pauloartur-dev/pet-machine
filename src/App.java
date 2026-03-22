import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    
    private final static machine petMachine = new machine();

    public static void main(String[] args) throws Exception {
        // Removi o useDelimiter("\\n") pois ele costuma causar mais erros em menus simples
        var option = -1;

        do {
            System.out.println("\n=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar o pet na máquina");
            System.out.println("8 - Retirar o pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            try {
                // JEITO SEGURO: Lemos a linha toda como texto e convertemos para número
                
                String input = scanner.nextLine();
                option = Integer.parseInt(input);

                switch (option) {
                    case 1 -> petMachine.takeAShower();
                    case 2 -> setWater();
                    case 3 -> setShampoor();
                    case 4 -> verifywater();
                    case 5 -> verifyShampoo();
                    case 6 -> checkIsHasPetInMachine();
                    case 7 -> setPetInMachine();
                    case 8 -> petMachine.removePet();
                    case 9 -> petMachine.wash();
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção Inválida! Tente um número de 0 a 9.");
                }
            } catch (NumberFormatException e) {
                // Se o usuário digitar uma letra, o programa cai aqui em vez de fechar
                System.out.println("ERRO: Por favor, digite apenas números inteiros.");
                option = -1; // Garante que o loop continue
            }
        } while (option != 0);
    }

    // --- Métodos Auxiliares

    public static void setWater() {
        System.out.println("Tentando colocar água na máquina...");
        petMachine.addWater();
    }

    public static void setShampoor() {
        System.out.println("Tentando colocar Shampoo na máquina...");
        petMachine.addShampoo();
    }

    public static void verifywater() {
        var amount = petMachine.getwater();
        System.out.println("A máquina está no momento com " + amount + " litros de água.");
    }

    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litros de Shampoo.");
    }

    public static void checkIsHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.nextLine(); // Usei nextLine() para aceitar nomes compostos (ex: "Rex Silva")
        }
        
        var p = new pet(name);
        petMachine.setPet(p);
        System.out.println("O pet " + p.getName() + " foi colocado na máquina.");
    }
}