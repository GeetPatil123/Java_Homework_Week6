package javaprogrammes;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and print the
 *     average of the numbers.
 */

public class Program13 {

    public static void main(String[] args) {//main method

        Scanner sca = new Scanner(System.in);//creating a scanner to take user input
        System.out.println("Enter first number: ");//asking to enter a number to the user
        int no1 = Integer.parseInt(sca.nextLine());//assisting/passing the value into a variable no1
        System.out.println("Enter second number: ");//asking to enter a number to the user
        int no2 = Integer.parseInt(sca.nextLine());//assisting/passing the value into a variable no2
        System.out.println("Enter third number:  ");//asking to enter a number to the user
        int no3 = Integer.parseInt(sca.nextLine());//assisting/passing the value into a variable no1
        average(no1,no2,no3);//calling the static method

        sca.close();//closing the scanner
    }

    public static void average(int no1,int no2, int no3){//static method
        int avgnum;//assisting a value
        avgnum = (no1 + no2 + no3) / 3;//calculating the average
        System.out.println("The average of three numbers is: " +avgnum);// printing the output
    }


}
