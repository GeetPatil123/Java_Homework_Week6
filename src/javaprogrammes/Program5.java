        package javaprogrammes;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Program5 {

    public static void main(String[] args) {// main method
        Scanner scan = new Scanner(System.in); // created a scanner object
        System.out.println("Please Enter First Number: ");//asking user to input the number
        int a = Integer.parseInt(scan.nextLine()); // passing user entered values into a
        System.out.println("Please Enter Second Number: ");//asking user to input the number
        int b = Integer.parseInt(scan.nextLine());// passing user entered values into a
        addition(a,b);// calling addition method
        subtraction(a,b);// calling  subtraction method
        Program5 obj = new Program5();// created an object to call an instance method
        obj.multiplication(a,b);
        obj.division(a,b);

        scan.close();
    }

    public static void addition( int a, int b){ // static method
        int ans1 = a + b;// performing addition operation
        System.out.println("The Addition of two numbers is : " + ans1);// printing the output
    }
    public static void subtraction( int a, int b){ //static method
        int ans1 = a - b;// performing subtraction operation
        System.out.println("The Subtraction of two numbers is : " + ans1);//printing the output
    }

    public void multiplication( int a, int b){// instance method
        int ans1 = a * b;// performing multiplication operation
        System.out.println("The Multiplication of two numbers is : " + ans1);//printing the output
    }

    public void division( int a, int b){// instance method
        int ans1 = a / b;// performing division operation
        System.out.println("The Division of two numbers is : " + ans1);//printing the output
    }
}
