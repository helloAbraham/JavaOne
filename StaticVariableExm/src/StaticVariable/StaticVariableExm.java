package StaticVariable;

/**
    This is the simple program for understanding how to use static variable.
    First we know that static variable used to refer to the common property of all objects
    The company name of employees, college name of students, would be used.
    Static variable gets memory only once in the class area at the time of class loading.
    Using a static variable makes your program more memory efficient (it saves memory).
    Static variable belongs to the class rather than the object.
 */

public class StaticVariableExm {
    int employeeId;
    String employeeName;
    //Let's use static variable using common purposes
    static String allInNY= "New York";

    public StaticVariableExm(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this. employeeName = employeeName;
    }

    public void display(){
        System.out.println("Employee Id " + employeeId + " " + "\nEmployeeName " + employeeName+"\n"+ allInNY);
    }

    // Also if we want we can use @Override method toString
    /**
    @Override
    public String toString(){
        return "EmployeeId " + employeeId+"\nemployee Name" + employeeName + "\n" + allInNY;
    }
    */
}
