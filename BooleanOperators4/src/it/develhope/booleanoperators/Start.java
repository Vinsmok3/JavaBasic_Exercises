package it.develhope.booleanoperators;
public class Start {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;
        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3));

        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        System.out.println((x * x - y * y / 2 != 12) || !t && f);
    }
}


