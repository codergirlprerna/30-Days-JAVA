//Multiple and nested exception handling
package Day13;

public class Activity3 {
    public static void main(String[] args) {
        //Task 7: Write a program that may throw both NumberFormatException and NullPointerException, and handle both using multiple catch blocks.
        //Task 8: Create a nested try-catch block where an inner block handles one exception and the outer block handles another.
        String input = "abc";
        try{
            int length = input.length();
            System.out.println("Length of input string: " + length);

            input="abc";
            int number = Integer.parseInt(input);
            System.out.println("Parsed Number:" + number);
        }catch(NullPointerException e){
            System.out.println("Error: Input String is null");
        }catch(NumberFormatException e){
            System.out.println("Error: Cannot convert string to number");
        }finally{
            System.out.println("Program ended.");
        }

        System.out.println("--------------------");

        try{
            int[] arr = new int[3];
            arr[2]=10;
            System.out.println("Outer try block running");
            try{
                int result = 10/0;
                System.out.println("Result: " +result);
            }catch(ArithmeticException e){
                System.out.println("Inner catch:Division by zero is not allowed");
            }
            arr[5]=100;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer Catch: Array index out of boounds");
        }finally{
            System.out.println("Program Ended");
        }
    }
}
