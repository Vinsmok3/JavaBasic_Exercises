package it.develhope.polymorphism;

public class Animal {
    public String animalName;
    public Animal(){
        animalName = animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");}

    public void animalSound(String intensity){
      if(intensity == "high") {
          System.out.println("Roarrrrrrrr!");
      }else if (intensity == "low") {
            System.out.println("Roar");}
      else{System.out.println("Cannot reproduce it properly");}
    }

}
