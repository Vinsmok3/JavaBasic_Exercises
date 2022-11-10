package it.develhope.defaultmethodsoverride;


public class Start {

    public static void main(String[] args) {
        // create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
        SmartphonePrice Producer1 = new SmartphonePrice("Producer", 22);
        SmartphonePrice Producer2 = new SmartphonePrice("Producer", 33);
        SmartphonePrice Retail1 = new SmartphonePrice("Retail", 44);
        SmartphonePrice Retail2 = new SmartphonePrice("Retail", 55);


        // crate two Smartphone objects using the 4 SmartphonePrice objects already created
        Smartphone Nokia = new Smartphone("Nokia", "N95", 2000,Producer1,Retail1);
        Smartphone Samsung = new Smartphone("Samsung", "Galaxy", 3000,Producer2,Retail2);

        // print the first smartphone object and the hashcode
        System.out.print(Nokia);
        System.out.print("--------------- HashCode :");
        System.out.println(Nokia.hashCode());

        System.out.print("---------------");
        // print the second smartphone object
        System.out.print(Samsung);

        // check if smartphone1 is equal to smartphone2
        System.out.print("----- Checking if they are equals! result:");
        System.out.print(Nokia.equals(Samsung));

        try {
            Smartphone smartphone2Clone = Samsung.clone();

            System.out.print("---------Checking if the clone is equal to Samsung----");
            System.out.println(Samsung.equals(smartphone2Clone));}
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");


        }
    }

}
