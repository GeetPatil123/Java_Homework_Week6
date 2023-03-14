package javaprogrammes;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6 {

    public static void main(String[] args) {// main static method
        Scanner sca = new Scanner(System.in);// using scanner to take user input
        System.out.print("Enter the radius of the circle: ");// asking to enter the value
        double radius = Integer.parseInt(sca.nextLine());//passing the value into radius variable
        circleValue(radius);//calling the instance method

        sca.close();// closing the scanner
    }
    public static void circleValue(double radius){// instance method
        double area;//assigning a variable to store the ans
        area = 3.14*radius*radius;//calculating the area of the circle
        System.out.println("Area of a circle is: " +area);//printing the output
    }
}
