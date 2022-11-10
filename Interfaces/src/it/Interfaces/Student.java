package it.Interfaces;

public class Student extends CollegePerson implements LearningPerson {


    @Override
    public void studyAtHome() {
        System.out.println("Student is studying at home!");

    }
    public int academicYear;

    public Student(String name, String surname , int id, int year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }

    @Override
    public void goToCollege() {
        System.out.println(name + ' ' + surname + ' ' + collegeId + ' ' + academicYear);

    }
}
