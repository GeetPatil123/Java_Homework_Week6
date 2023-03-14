package javaprogrammes;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19 {
        public static void main(String[] args) {//main method
            Scanner sca = new Scanner(System.in);//created a scanner to accept data from the user
            System.out.println("Enter the parse in Uppercase: ");//asking for data input
            String convert = sca.nextLine();//passing/storing into convert
            Program19 obj = new Program19();//creating a object for instance method
            obj.stringConverter(convert);//calling the instance method
            sca.close();//closing scanner
    }

    public void stringConverter(String convert){//static method
        //printing before and after result
        System.out.println("You entered before conversation: " +convert);

        System.out.println("String after conversation is :" +convert.toLowerCase());
        }
}
