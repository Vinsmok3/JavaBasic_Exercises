package it.develhope.staticstuff;

/**
 * Tester class with main method.
 * @author Batman
 */
public class Start {
    
    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {
    // create two new Employees
     Employee Paolo = new Employee("Paolone", "BestSupport", "QLash");
     Employee Teresa = new Employee("Teresa","BestTop","Milano");


     // create their new 2 Badges
     Badge badge1 = new Badge(Paolo);
     Badge badge2 = new Badge(Teresa);
     // show to the user the 2 employees' badge details
    badge1.showBadgeDetails();
    badge2.showBadgeDetails();

    }

}
