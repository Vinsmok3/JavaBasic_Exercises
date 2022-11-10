package it.Interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
    @Override
    public void teachToOtherPeople() {
        System.out.println("This person can teach!");
    }
    public String teachingSubject;

    public Professor(String name, String surname, int id, String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

    @Override
    public void goToCollege() {
        System.out.println(name + ' ' + surname + ' ' + collegeId + ' ' + teachingSubject);


    }
}
