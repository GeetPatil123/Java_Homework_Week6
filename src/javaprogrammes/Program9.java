package javaprogrammes;

import java.util.Scanner;

// 9. Write a program to convert the upper case to lower case.
public class Program9 {
    public static void main(String [] args) {//main method
        Scanner sca = new Scanner(System.in);// created a scanner to take input from scanner
        System.out.println("Enter any message in upper case: ");// asking for input from the user
        String msg = sca.nextLine();//storing a message into msg
        caseConverter(msg);//calling the static method

        sca.close();//closing the scanner
    }
    public static void caseConverter(String msg){ //static method
        System.out.println("You entered before : " +msg);//printing user entered before
        System.out.println("Result is: " +msg.toLowerCase());//printing the outcome
    }
}
