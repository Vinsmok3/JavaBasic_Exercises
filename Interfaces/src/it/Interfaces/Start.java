package it.Interfaces;
public class Start {
    public static void main(String[] args) {
      Student student = new Student("Paolo", "Support",22, 24);
      Professor professor = new Professor("Fragola", "Jungler", 22, "Storia");
      Assistant assistant = new Assistant("Terenas", "Top", 22, true);

      student.goToCollege();
      professor.goToCollege();
      assistant.goToCollege();

      student.studyAtHome();
      professor.teachToOtherPeople();
      assistant.studyAtHome();
      assistant.teachToOtherPeople();



    }
}


