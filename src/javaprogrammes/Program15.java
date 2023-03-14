package javaprogrammes;
// 15. Write a Java program to swap two variables.

import java.util.Scanner;//importing a scanner into the calss

public class Program15 {

    public static void main(String[] args) {//main method
        Scanner sca = new Scanner(System.in);//created scanner to take user input
        System.out.println("Enter fist variable: ");//asking for user input
        int v1 = Integer.parseInt(sca.nextLine());//passing the input value
        System.out.println("Enter second variable: ");//asking for user input
        int v2 = Integer.parseInt(sca.nextLine());//passing the input value
        swap(v1,v2);//calling static method

        sca.close();//closing scanner
    }

    public static void swap(int v1, int v2){//instance method

        System.out.println("Value of v1 before swapping is: " +v1);//before swapping output
        System.out.println("Value of v2 before swapping is: " +v2);//before swapping output
        System.out.println();
        //swapping the input
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        System.out.println("Value of v1 after swapping is: " +v1);//printing the output
        System.out.println("Value of v2 after swapping is: " +v2);//printing the output
    }
}
