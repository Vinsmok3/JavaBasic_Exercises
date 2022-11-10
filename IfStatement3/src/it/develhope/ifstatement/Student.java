package it.develhope.ifstatement;
import java.util.*;
    public class Student {
        String name;
        int age;

        public void setAgeAndName(String studentName, int studentAge){
            studentName = name;
            studentAge = age;
        }

        Random randomName = new Random();


        public void guessingAge(){
            int randomInt = randomName.nextInt(35);
            System.out.println("I generated the random number" + " " + randomInt + " " + "for" + " " + name);
            if(randomInt == age){
                System.out.println("The random value is equal to student's age");
            }else if(randomInt > age){
                System.out.println("The random value is greater than student's age");}
            else System.out.println("The random value is lower than student's age");
            }
        }




