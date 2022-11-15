package it.develhope.stringhandling;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String array1[] = {" i want "," to learn "," how to code! " };

        String[] array2 = new String[array1.length];
        for (int i = 0; i < array1.length; i++)
            array2[i] = array1[i].trim();

        System.out.println(Arrays.toString(array2));
        int statement1 = array2[0].compareTo("I want");
        int statement2 = array2[1].compareTo("To learn");
        System.out.println(!(statement1 > statement2));

    }
}

