package javaprogrammes;
/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    static int a = 10; // static variables
    static int b = 30; // static variables

    public static void main(String[] args) { // main static method
        myMethod(); //as the method is static you can call direct
    }
    public static void myMethod(){ // instance method
        // As the variables and the method are static you can call them in directly
        System.out.println(a); // printing the static variables in static method
        System.out.println(b);// printing the static variables in static method


    }
}
