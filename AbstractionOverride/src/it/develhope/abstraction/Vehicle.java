package it.develhope.abstraction;

/**
 * This abstract class represents a Vehicle and one of its methods is abstract
 */
public abstract class Vehicle {
    public String type;
    public int numberOfWheels;


    /**
     * Method that prints the vehicle's details
     */
    public void showVehicleDetails(){
        System.out.println("This vehicle is a" + " " + type + " " + "and has" + " " + numberOfWheels + " " + "wheels");
    }


    /**
     * Abstract method that needs to implemented for revealing the vehicle sound
     */
    public abstract void doVehicleSound();{}


}