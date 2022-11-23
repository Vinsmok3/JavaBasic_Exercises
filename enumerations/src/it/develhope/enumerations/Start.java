package it.develhope.enumerations;
public class Start {

    public static void main(String[] args) {
        enum Months {January, February, March, April, May, June, July, August, September, October, November, December}

        for (Months months : Months.values()){
            if (months.toString().endsWith("y")){
                System.out.println(months + " " + "this one have Y");
            }else if(!months.toString().endsWith("y")){
                 System.out.println(months + " " + "this one doesn't have Y");
            }
        }
    }}