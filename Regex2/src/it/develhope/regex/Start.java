package it.develhope.regex;
    public class Start {
        public static void main(String[] args) {
            String words = "tup tuup tuuup tuuuup";
            String moddedWords = words.replaceAll("u{2,3}", "x");
            System.out.println(moddedWords);
        }
}


