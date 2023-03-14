package javaprogrammes;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10 Input
 * second binary number: 11 Expected Output: Sum of two binary numbers: 101
 */

public class Program16 {
    public static void main(String[] args) { // main method

        //calling the instance method by creating an object as main method is static
        Program16 obj = new Program16();
        obj.binaryNumbers();
    }
    public void binaryNumbers(){ // instance method
        Scanner sca = new Scanner(System.in); // using scanner to take input from user
        System.out.println("Enter the first Binary number: "); // asking the user enter 1st number
        String a = sca.next(); // passing the number
        System.out.println("Enter the second Binary number: "); // asking the user to enter 2nd number
        String b = sca.next(); // passing the number
        int c = Integer.parseInt(a,2); // convert binary to integer
        int d = Integer.parseInt(b,2);
        int e = c+d; // performing addition
        System.out.println("Addition of Binary numbers is: " +Integer.toBinaryString(e)); // printing output
        sca.close(); // closing the scanner
    }

}
