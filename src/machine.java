public class machine {
     private boolean clean = true;
     private int water =30;
     private int shampoo =10;
     private pet pet;
     

     

     public void takeAShower(){
        if(this.pet== null){
            System.out.println("coloque o pet na maquina para iniciar o banho");
            return;
        }

        this.water -=10;
        this.shampoo -=2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "esta limpo");
     }
     public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de água da maquina está no maximo");
            return;
        }
        water +=2;
     }

     public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina está no maximo");
            return;
        }
        shampoo +=2;

      }

   public int getwater(){
    return water;
   }

   public int getShampoo(){
    return shampoo;
   }

   public boolean hasPet(){
    return pet !=null;
   }

   public void setPet(pet pet){
    if(!this.clean){
    System.out.println("A máquina está suja é necessário limpa-la");
    }

    if(hasPet()){
    System.out.println("O pet "  + this.pet.getName() + " esta na maquina neste momento");
    }
    this.pet = pet;
   }
  public void removePet(){
    this.clean = this.pet.isClean();
    System.out.println("O pet " + this.pet.getName() + " está limpo"); 
     this.pet = null;
  }

  public void wash(){
    this.water -=10;
    this.shampoo -=2;
    this.clean = true;
  System.out.println("A máquina está limpa");
  }


}
