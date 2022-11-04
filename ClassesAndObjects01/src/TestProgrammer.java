public class TestProgrammer {
    public static void main(String args[]) {

        Programmer persona1 = new Programmer();
        persona1.name = "Paolo";
        persona1.age = 22;
        persona1.wearsGlasses = true;

        Programmer persona2 = new Programmer();
        persona2.name = "Marco";
        persona2.age = 22;
        persona2.wearsGlasses = false;

        persona1.drinkCoffe();
        persona1.printDetails();

        persona2.printDetails();
        persona2.hasGlasses();

    }


}
