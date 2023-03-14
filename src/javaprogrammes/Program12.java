package javaprogrammes;
/**
 * 12. Write a Java program to compute the specified expressions and print the output.
 * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output : 2.138888888888889
 */
public class Program12 {

    public static void main(String[] args) {// main method
    Program12 obj = new Program12();//created an objected to call instance method
    obj.specifiedExpressions();//calling an instance method
    }
    public void specifiedExpressions() {//instance method
        //assigning a value
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double output;
        System.out.println("Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) ");
        System.out.println("Expected Output is : 2.138888888888889");
        output = (a * b - b * b) / (c - d);//calculating the desired output
        System.out.println("Actual output is: " +output);//printing an result
    }
}
