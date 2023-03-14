package javaprogrammes;

/**
 * 10. Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number: 8 Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
 */
public class Program10 {

    public static void main(String[] args) {//main method
    Program10 obj = new Program10();//created an objected to call instance method
    obj.multiplicationTable();//calling the instance method
    }

    public void multiplicationTable(){//instance method
        int a = 8;// passing/assisting a value
        //printing 8 times table using print statement
        System.out.println("Test data input given is 8. Multiplication table for this input number is as follows:  ");
        System.out.println("8*1=" + a);
        System.out.println("8*2=" +a * 2 );
        System.out.println("8*3=" +a * 3 );
        System.out.println("8*4=" +a * 4 );
        System.out.println("8*5=" +a * 5 );
        System.out.println("8*6=" +a * 6 );
        System.out.println("8*7=" +a * 7 );
        System.out.println("8*8=" +a * 8 );
        System.out.println("8*9=" +a * 9 );
        System.out.println("8*10=" +a * 10 );
    }
}
