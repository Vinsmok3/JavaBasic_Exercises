public class Teacher {
    public String teacherName;
    public Teacher(){
        System.out.println("A Teacher has appeared!");
    }
    public void assignGrade(Student alum, int finalGrade){
        alum.grade = finalGrade;
    }
}
