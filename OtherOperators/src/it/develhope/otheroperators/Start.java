package it.develhope.otheroperators;
public class Start {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;
        System.out.println(b); // 17
        System.out.println(b*b+1); //if b*b++ result is 289 with rest of 0
        System.out.println(b%3);
        // result is 290 with rest of 2
    }
}

