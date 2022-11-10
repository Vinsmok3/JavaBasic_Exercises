package it.develhope.abstraction;

public class Start {

    public static void main(String[] args) {

     Car car = new Car(4,4,22000);// create a Car object
     car.doVehicleSound();// listen to the Car sound
     car.showVehicleDetails();// show the Vehicle details

     Boat boat = new Boat(200, 500);   // create a Boat object
     boat.doVehicleSound();                                      // listen to the Boat sound
     boat.showVehicleDetails();                                   // show the Vehicle details
     System.out.println(boat.getBoatWeightAndSpeed());// print the Boat weight and speed

    }

}
