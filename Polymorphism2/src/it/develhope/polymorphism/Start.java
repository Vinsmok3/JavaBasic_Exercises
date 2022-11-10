package it.develhope.polymorphism;

public class Start {

    public static void main(String args[]) {

    Animal animal = new Animal();
    Lion lion = new Lion();
    Cow cow = new Cow();


    lion.animalSound();
    cow.animalSound();
    animal.animalSound();
        

    }

}
