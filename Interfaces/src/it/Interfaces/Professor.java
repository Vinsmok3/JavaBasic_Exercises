package it.Interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
    @Override
    public void teachToOtherPeople() {
        System.out.println("This person can teach!");
    }
    public String teachingSubject;

    public Professor() {

    }

}
