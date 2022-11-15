package it.develhope.booleanoperators;
public class Start {
    public static void main(String[] args) {
        System.out.println(!(!(!(false ^ false) || (true && true))));
        int x = 3;
        int y = 2;
        System.out.println(!((x * y) <= 6) && (x - y != 1));

    }
}


