package it.develhope.regex;
public class Start {
    public static void main(String[] args) {
        String words = "I Like to code near the Lake with my friend Luke";
        String moddedWords = words.replaceAll("L[^u]ke", "BLA");
        System.out.println(moddedWords);
    }
}
