package it.develhope.staticstuff;



/**
 * Class that represents an office badge
 * @author Batman
 */
public class Badge{

    private static int totalNumberOfEmployess;          // private static variable (property shared across different objects)
    private String badgeIdCode;                         // each employee's personal badge id code
    public Employee employee;                         // each badge is associated to an Employee


    /**
     * Static method that creates the badge number just by adding 1 to the static badgeNumber
     */
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployess++;// use the summation operator to add 1 to the badgeNumber
    }


    /**
     * Method that generates the identifier for each Badge
     * @return a String containing name and surname of the employee between two codes
     */
    private String generateBadgeIdCode(){
        return Random.generateString(3,Random.UPPERCASE) + employee.name + employee.surname + Random.generateString(3,Random.UPPERCASE);
    }
    

    /**
     * Method that prints all the employee details and the relative badgeNumber
     */
    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployess);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
    }

    

    /**
     * Badge's constructor method
     * @param employeeThatNeedsBadge it's the Employee object that will need to be associated to the Badge
     */
    public Badge (Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

}
