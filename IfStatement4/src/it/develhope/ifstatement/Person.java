package it.develhope.ifstatement;
public class Person {
    public int age;
    int max = 80;
    int min = 5;

    public void randomvalue(){
        int x = (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(x);
    age =  x;
    }
    public void getLifeStage(){
        if(age <= 12){
            System.out.println("The person is in the Child stage of life");
        }else if(age > 13 && age < 19){
            System.out.println("The person is in the Teen stage of life");
        }else if(age > 20 && age <59){
            System.out.println("The person is in the Adult stage of life");
        }else{System.out.println("The person is in the Senior Adult stage of life");}



    }
}


        // narrow casting is necessary because Math.floor returns a double
        