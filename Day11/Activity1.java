//Method Overloading-(Compile time polymorphism)
package Day11;
public class Activity1 {
    public static int add(int a,int b){
        return a + b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static String add(String a,String b){
        return a+b;
    }
    public static void main(String[] args) {
        //Task 1: Create a class Calculator with overloaded add() methods (e.g., add(int, int), add(double, double), add(String, String)).
        //Task 2: Call each overloaded method and print the result.
        System.out.println("Addition of two numbers: " + add(4,5));
        System.out.println("Addition of double numbers " + add(4.0,5.0));
        System.out.println("Concatenation of two strings: " + add("Hello" , "World"));

    }
}
