package javaprogrammes;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String[] args) { // main method
        Scanner sca = new Scanner(System.in);// using scanner to take user input
        System.out.print("Enter the temperature value in degree Fahrenheit: ");// asking to enter the value
        double fvalue = Integer.parseInt(sca.nextLine());//passing the value into fvalue variable
        Program7 obj = new Program7();// created an object to call instance method
        obj.temperature(fvalue);//calling instance method
        sca.close();// closing scanner
    }

    public void temperature(double fvalue){//instance methhod
        double celsius;//assing a variable
        celsius = (fvalue-32) * 5/9;//calculating the answer
        System.out.println("Temperature value in degree Fahrenheit and converted into degree Celsius: 0 C" + " " +celsius);
        //printing the answer

    }
}
