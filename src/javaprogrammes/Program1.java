package javaprogrammes;

/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {
    int a = 20; // instance variable
    int b = 10; // instance variable

    public static void main(String[] args) { // main method
        /* I've created an object to call myMethod which is an instance method as
         *  the main method is static
         */
        Program1 obj = new Program1(); // object of instance method
        obj.myMethod();
    }
    public void myMethod() {  // instance method
        /*
         have called both the variables directly as the method and
         variables declared both are instance
         */
        System.out.println(a);// printing the instance variables into instance method
        System.out.println(b);// printing the instance variables into instance method


    }

}
