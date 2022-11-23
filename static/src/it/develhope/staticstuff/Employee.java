package it.develhope.staticstuff;

/**
 * Class that represents an office employee
 * @author Batman
 */
public class Employee {
    public String name;
    public String surname;
    public String address;


    /**
     * Employee's constructor method
     * @param newEmployeeName String name of the new employee
     * @param newEmployeeSurname String surname of the new employee
     * @param newEmployeeAddress String address of the new employee
     */
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }
	 

    /**
     * Get all the details regarding an employee
     * @return a String with the employee's name, surname and address
     */
    public String getEmployeeDetails(){
        return name + "\s" + surname + "\s" + address;
    }
}
