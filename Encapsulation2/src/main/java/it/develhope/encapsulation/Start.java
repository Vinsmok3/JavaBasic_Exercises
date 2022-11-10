package it.develhope.encapsulation;



public class Start {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(4);
        person.setHeight(5.55);
        person.setName("Paolone");
        person.setSurname("Russo");

        System.out.println(person.getAge());
        System.out.println(person.getHeight());
        System.out.println(person.getName());
        System.out.println(person.getSurname());



    }}
