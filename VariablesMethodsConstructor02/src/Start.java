public class Start {
    public static void main(String args[]){
        Student student1 = new Student("Paolo");
        Student student2 = new Student("Teresa");

        Teacher teacher = new Teacher();
        teacher.teacherName = "Paola";

        teacher.assignGrade(student1, 8);
        teacher.assignGrade(student2, 9);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }

}
