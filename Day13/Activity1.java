//Basic Try-Catch
package Day13;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task 1: Write a program to divide two numbers and handle division by zero using try-catch.
        //Task 2: Create an array and attempt to access an out-of-bounds index. Catch ArrayIndexOutOfBoundsException.
        //Task 3: Use a finally block in the above tasks to print a closing message.


        try{
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " +  result);
        }catch(ArithmeticException e){
            System.out.println("Error Division by zero is not allowed");
        }finally{
            sc.close();
            System.out.println("Program Ended");
        }

        System.out.println("------------");
        
        int[] numbers= {10,20,30,40,50};
        try{
            System.out.println("Accessing index 10: " + numbers[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bond exception");
        }finally{
            System.out.println("Program Ended");
        }

    }
}
