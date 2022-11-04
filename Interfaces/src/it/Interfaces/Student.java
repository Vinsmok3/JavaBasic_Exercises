package it.Interfaces;

public class Student extends CollegePerson implements LearningPerson {


    @Override
    public void studyAtHome() {
        System.out.println("Student is studying at home!");

    }
    public int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super();
    }

}
