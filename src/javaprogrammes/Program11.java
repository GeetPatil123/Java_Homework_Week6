package javaprogrammes;

/**
 * 11. Write a Java program to display the following pattern.
 * Sample Pattern : J a v v a J a a v v a a J J aaaaa V V aaaaa J J a a V a a
 */
public class Program11 {

    public static void main(String[] args) {// main method
        samplePattern();//calling static method
    }

    public static void samplePattern() {//static method
        //printing a pattern as asked
        System.out.println("   J   a   v   v  a   ");
        System.out.println("   J  a  a  V  V  a  a   ");
        System.out.println("   J  J  aaaaa    V  V aaaaa");
        System.out.println("   J  J  a   a  V    a  a");
    }

}
