package it.develhope.regex;
public class Start {
    public static void main(String[] args) {
        String words = "x3z ? xYz ! R1 && __";
        String moddedWords = words.replaceAll("[a-z0-9]","*");
        System.out.println(moddedWords);
    }
}

