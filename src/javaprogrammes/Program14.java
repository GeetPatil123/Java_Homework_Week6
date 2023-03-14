package javaprogrammes;
/**
 * 14. Write a Java program to print the area and perimeter of a rectangle. Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.5 * 8.5 = 47.60 Perimeter is 2 * (5.5 + 8.5) = 28.20 15. Write
 */public class Program14 {

    public static void main(String[] args) {//main method
        System.out.println("Test Data: Width = 5.5 Height = 8.5 ");//asking to enter a number to the user
        System.out.println("Expected Output: ");//printing expected output
        System.out.println("Area is 5.5 * 8.5 = 46.75");//calculating the area of a rectangle
        System.out.println("Perimeter is 2 * (5.5 + 8.5) = 28.00");//calculating the perimeter of a rectangle
        System.out.println();
        Program14 obj = new Program14();//created an object to call instance method
        obj.rectangle();//calling the instance method
    }
    void  rectangle(){//instance method
        double width = 5.5;//asserting a value
        double height = 8.5;//asserting a value
        double area;//asserting a variable
        double perimeter;//asserting a variable
        System.out.println("Actual output is as follows: ");//printing the output
        area = width * height;//calculating the area
        System.out.println("Area of rectangle is: " +area);//print the calculated area output
        perimeter = 2 * (5.5 + 8.5);//calculating the perimeter
        System.out.println("Perimeter of a rectangle is: " +perimeter);// printing the perimeter answer
    }
}
