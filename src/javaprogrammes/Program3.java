package javaprogrammes;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
    public class Program3 {
    int a=10; // instance variable
    static int b=30; // static variable

    public static void main(String[] args) { // main static method
    Program3 obj = new Program3(); // created object of a class to the instance method
    obj.instanceMethod(); //object to call instance method
    System.out.println();
    staticMethod(obj.a); // calling static method as it's a static method no need to create an object we can call directly

    }
    public void instanceMethod(){ // instanceMethod
        System.out.println("Instance and static variable from Instance method");
        System.out.println("Instance variable is: " +a); // printing variables assigned in a class
        System.out.println("Static variable is: " +b); // printing variables assigned in a class
    }
    public static void staticMethod(int a){ //staticMethod
        System.out.println("Static and Instance variable from static method");
        System.out.println("Instance variable is: " +a); // printing variables assigned in a class
        System.out.println("Static variable is: " +b); // printing variables assigned in a class
    }

}
