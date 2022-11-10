package it.develhope.ifstatement;

// using a variable to avoid repeating 2 times the System.out.println inside the statement
 public class Start {
     public static void oddName(){
         System.out.println("your name is odd");
     }
    public static void main(String ...args) {
        String myName = "Cristiann";

        if(myName.length() % 2 == 0){
            System.out.println("your name is even");
        }else oddName(); //System.out.println("your name is odd");//



    }
}