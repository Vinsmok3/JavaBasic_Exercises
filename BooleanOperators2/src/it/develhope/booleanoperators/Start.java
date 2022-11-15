package it.develhope.booleanoperators;
public class Start {
    public static void main(String[] args) {
        System.out.println((55 != 55) && (false ^ true));
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        System.out.println((!a || !b) || c == d );
        System.out.println( false && true || false && !false);
        System.out.println((false && true) || (false || true));

    }
}


