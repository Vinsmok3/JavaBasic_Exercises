package it.develhope.regex;

public class Start {

    public static void main(String[] args) {

                String words = "are you able to climb, are you able to swim or are you able to fly?";
                String moddedWords = words.replaceAll("\sare", "_XYZ");
                System.out.println(moddedWords);
            }
        }






