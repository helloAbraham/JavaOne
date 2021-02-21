package StaticVariable;

/**
        This simple program's main concern is that how static variable takes part of the method
        Even though we didn't use in parameterized in the constructor
        we can use it any method on that class to use inside the method
        for, instance when we create an object StaticVariableExm se
        We just added two items such as 107, Mr.James Gosling, however, we didn't add New York
        only for static variable reason it comes since it has been used inside the void display method.
        That's the reason.
 */
public class StaticVariableDemo {

    public static void main(String[] args) {
        StaticVariableExm se = new StaticVariableExm(107, "Mr. James Gosling");
        StaticVariableExm se1= new StaticVariableExm(505, "Mr. Abraham");

        //Calling here void display method
        se.display();
        se1.display();

        //Here calling @Override method toString
       // System.out.println(se.toString());
    }

}
