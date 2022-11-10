package it.develhope.overload;

/**
 * Tester class with main method.
 * @author Clint Eastwood
 */
public class Tester {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {

        // create the 5 shapes
        Shape undefined = new Shape();
        Shape circle = new Shape(5.5);
        Shape square = new Shape(4, 5.2);
        Shape rectangle = new Shape(4, 5.5, 22);
        Shape triangle = new Shape(3, 5.5,5.3,22);



        // invoke the getShapeDetails() method for the 5 shapes and assign to respective variables
        undefined.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();

        // inform the user
        System.out.println(undefined.getShapeDetails());
        System.out.println(circle.getShapeDetails());
        System.out.println(square.getShapeDetails());
        System.out.println(rectangle.getShapeDetails());
        System.out.println(triangle.getShapeDetails());

}}
