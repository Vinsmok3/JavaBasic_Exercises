package it.develhope.javadoc;

/**
 * this is your main class, put your objects, methods, ecc here
 */

public class Tester {
    /**
     * main method, a must for run your methods
     * @param args put your desired numbers in the methods fields
     */
    public static void main(String[] args) {
        ArithmeticOperators arithmetic = new ArithmeticOperators();
        System.out.println(arithmetic.sum(22,2));
        System.out.println(arithmetic.sub(22,2));
        System.out.println(arithmetic.mul(22,2));
        System.out.println(arithmetic.div(22,2));
    }
}

