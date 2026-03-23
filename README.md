🚀 PetMachine - Sistema de Banho Automatizado
Este é um projeto desenvolvido em Java que simula o funcionamento de uma máquina de banho para pets. O foco principal deste sistema é a aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO) e a construção de uma interface de linha de comando robusta com tratamento de erros.

🛠️ Tecnologias Utilizadas
Linguagem: Java 17+

Ferramentas: VS Code / NetBeans

Conceitos Aplicados:

Encapsulamento (private/public).

Métodos e Atributos Estáticos.

Tratamento de Exceções (try-catch, NumberFormatException).

Manipulação de entrada de dados com Scanner.

📌 Funcionalidades
O sistema oferece um menu interativo com as seguintes opções:

[x] Gerenciamento de Insumos: Abastecer e verificar níveis de água e shampoo.

[x] Controle de Fluxo: Colocar um pet na máquina e retirá-lo após o serviço.

[x] Operação de Banho: Executar o ciclo de banho (consome insumos).

[x] Manutenção: Limpeza interna da máquina.

[x] Interface Segura: Prevenção de erros caso o usuário digite letras em campos numéricos.

💻 Como Rodar o Projeto
Certifique-se de ter o JDK instalado em sua máquina.

Clone este repositório:

Bash
git clone https://github.com/pauloartur-dev/pet-machine.git
Navegue até a pasta do projeto:

Bash
cd pet-machine-java
Compile e execute a classe principal:

Bash
javac App.java
java App


🧠 Desafios Vencidos
Durante o desenvolvimento, um dos maiores desafios foi lidar com o comportamento do buffer do Scanner no Java. Foi implementada uma solução utilizando Integer.parseInt(scanner.nextLine()) dentro de um bloco try-catch, garantindo que o programa não encerre abruptamente caso ocorra um erro de entrada (InputMismatchException).

👤 Autor
Paulo Artur Aragão Estudante de Ciência da Computação - UFERSA (3º Período)