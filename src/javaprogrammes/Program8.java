package javaprogrammes;

 // 8. Write a program to calculate the area of a triangle.

import java.util.Scanner;//importing scanner to user scanner in the class

public class Program8 {//class
    public static void main(String[] args) {//main method
        Scanner sca = new Scanner(System.in);//created a scanner to take user input
        System.out.print("Enter the base of a Triangle: ");// asking for user input
        int b = Integer.parseInt(sca.nextLine());//storing the input in b
        System.out.print("Enter the height of a Triangle: ");// asking for user input
        int h = Integer.parseInt(sca.nextLine());//storing the input in h
        Program8 obj = new Program8();//created object for instance method
        obj.area(b,h);//calling instance method
        sca.close();//closing scanner
    }
    public void area(int b, int h){//instance method
        int cal;//assigning a variable to store the ans
        cal =  (b * h) / 2;// calculating area of a triangle
        System.out.println("Area of a Triangle is: " +cal);//printing the output

    }

}
