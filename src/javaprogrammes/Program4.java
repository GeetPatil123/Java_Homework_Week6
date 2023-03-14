package javaprogrammes;
/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
        public class Program4 {

            int a=10; // instance variable declaration
            int b=20; // instance variable declaration

            static int c=30; // static variable declaration
            static  int d=40; // static variable declaration

            public static void main(String[] args) { // main method
                Program4 obj = new Program4(); // objected created to call instance method
                obj.instanceMethod(); // calling instance method
                System.out.println();
                staticMethod(obj.a, obj.b); // calling static method

            }
            public static void staticMethod(int a, int b){ //static method passing a & b as this is a static method the value is instanced
                 System.out.println("Static and Instance variable from static method: ");
                 System.out.println("Static variable is: " +c);// printing values
                 System.out.println("Static variable is: " +d);// printing values
                 System.out.println("Instance variable is: " +a);// printing values
                 System.out.println("Instance variable is: " +b);// printing values
             }
             public void instanceMethod(){ // instance method
                 System.out.println("Instance and static variable from Instance method: ");
                 System.out.println("Instance variable is: " +a);// printing values
                 System.out.println("Instance variable is: " +b);// printing values
                 System.out.println("Static variable is: " +c);// printing values
                 System.out.println("Static variable is: " +d);// printing values

             }


}
