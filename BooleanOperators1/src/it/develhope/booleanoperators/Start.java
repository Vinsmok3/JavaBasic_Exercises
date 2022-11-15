package it.develhope.booleanoperators;

public class Start {
    public static void main(String[] args) {
        System.out.println(2 <= 2 && !true);
        System.out.println(!false && 3 > 2);
        boolean t = false;
        boolean f = true;
        System.out.println(!(!t || f));
        System.out.println(6 > 6 ^ !(true && true));
    }

}