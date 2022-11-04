public class Student {
    public String name;
    public int grade;
    public Student(String studentName){
        System.out.println("A Student has appeared!");
        this.name = studentName;
    }
    public void getStudentDetails(){
        System.out.println(name + " " + grade );
    }

}
