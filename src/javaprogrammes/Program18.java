package javaprogrammes;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data: Input first number: 125 Input second number: 24
 * Expected Output : 125 + 24 = 149 125 - 24 = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5 19.
 */
    public class Program18 {
    public static void main(String[] args) {//main method
        int fno = 125;//passing a value
        int sn0 = 24;//passing a value
        addition(fno,sn0);//calling static method
        subtract(fno,sn0);//calling static method
        multiplication(fno,sn0);//calling static method
        division(fno,sn0);//calling static method
        remainder(fno,sn0);//calling static method

    }

    public static void addition(int fno, int sno){// static method
        double output;//assisting a value
        output = fno + sno;//calculating the output
        System.out.println("Addition of two numbers is: " +output);//printing the result
    }

    public static void subtract(int fno, int sno){// static method
        double output;//assisting a value
        output = fno - sno;//calculating the output
        System.out.println("Subtraction of two numbers is: " +output);//printing the result
    }
    public static void multiplication(int fno, int sno){// static method
        double output;//assisting a value
        output = fno * sno;//calculating the output
        System.out.println("Multiplication of two numbers is: " +output);//printing the result
    }
    public static void division(int fno, int sno){// static method
        double output;//assisting a value
        output = fno / sno;//calculating the output
        System.out.println("Division of two numbers is: " +output);//printing the result
    }
    public static void remainder(int fno, int sno){// static method
        double output;//assisting a value
        output = fno % sno;//calculating the output
        System.out.println("Remainder of two numbers is: " +output);//printing the result
    }
}
