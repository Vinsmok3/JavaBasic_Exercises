package it.Interfaces;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    @Override
    public void studyAtHome() {
        System.out.println("I can teach!");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I can learn!");
    }

    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void goToCollege() {
        System.out.println(name + ' ' + surname + ' ' + collegeId + ' ' + isGoingToBeAPhD);
    }
}
