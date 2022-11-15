package it.develhope.stringhandling;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        char[] charMyArray = new char[4];
        string1.getChars(0,2,charMyArray,0);
        string2.getChars(10,12,charMyArray,2);

        System.out.println(Arrays.toString(charMyArray));
    }
}




