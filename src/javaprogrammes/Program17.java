package javaprogrammes;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5 Expected Output Binary number is: 101
 */

public class Program17 {

    public static void main(String[] args) {
        //calling the instance method by creating an object as main method is static
        Program17 obj = new Program17();
        obj.decimalToBinary();
    }
        public void decimalToBinary() { // instance method
            Scanner sca = new Scanner(System.in); // using scanner to take user input
            System.out.println("Enter any decimal number to convert into binary number: "); // asking the user the input
            String binary = sca.nextLine(); // user input is saved here
            int num = Integer.parseInt(binary); // variable is assigned to save the result and print
            System.out.println("Expected Output Binary number is: " +Integer.toBinaryString(num)); // printing the output
            sca.close(); // closing the scanner
        }
}
