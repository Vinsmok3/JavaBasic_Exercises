package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

       // this is needed to consume the new line left-over after nextInt()

        House house = new House();
        house.setAddress("Via Roma 1");
        house.setFloorNumber(4);
        //String[] residentsNames = new String[]{"Paolo", "Fragola", "Teresa"};//
        house.setResidentsNames(new String[]{"Paolo","Fragola","Teresa"});
        //house.setResidentsNames();//

        String address = String.format(house.getAddress());
        String floorNumber = String.format("There are" + " " + house.getFloorNumber() +" " + "floors");
        String residentsNames = String.format("In this house are living: " + " " + Arrays.toString(house.getResidentsNames()));

        System.out.println(address);
        System.out.println(floorNumber);
        System.out.println(residentsNames);
        //System.out.println(Arrays.toString(house.getResidentsNames()));//


    }

}
