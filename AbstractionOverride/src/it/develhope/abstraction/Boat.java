package it.develhope.abstraction;

/**
 * A Boat class is a practical extension of the Vehicle abstraction
 */
public class Boat extends Vehicle{
   public double maxKnotsSpeed;
   public int boatKilosWeight;
    // mandatory override of the abstract method doVehicleSound()
    @Override
    public void doVehicleSound() {
        System.out.println("WROOOOOOM");
    }

    /**
     * Constructor method for Boat
     * @param maxSpeed double representing the maximum Boat speed in knots
     * @param weight an int for the total weight in kilos
     */
        // it's not really necessary because numberOfWheels is initialised by default at 0
        public Boat (double maxSpeed, int weight){
            type = "boat";
            maxKnotsSpeed = maxSpeed;
            boatKilosWeight = weight;
        }
    

    /**
     * Method that returns the boat details.
     *
     * @return a String indicating the total kilos weight and the maximum knots speed
     */
    public String getBoatWeightAndSpeed(){return boatKilosWeight + " " + maxKnotsSpeed;}
}
    

