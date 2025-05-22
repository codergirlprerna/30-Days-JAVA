//Custom Exceptions
package Day13;

import java.util.Scanner;

public class Activity2 {
    static class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task 4: Throw IllegalArgumentException if a method receives a negative number as input.
        //Task 5: Create a custom exception InvalidAgeException that extends Exception.
        //Task 6: In a method, throw InvalidAgeException if age is less than 18. Use throws keyword and handle the exception in the caller method.


        try{
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if(num<0){
                throw new IllegalArgumentException("Number can't be negative");
            }
            System.out.println("Number is: " + num);
        }catch(IllegalArgumentException e){
           System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Program ended");
        }
        System.out.println("------------------------");

        try{
        System.out.println("Enter age:");
        int age=sc.nextInt();
        if(age<0 || age>18){
            throw new InvalidAgeException("Invalid age enter age must be between 0 to 18");
            
        }
        System.out.println("Age is: " + age);
    }catch(InvalidAgeException e){
        System.out.println("Error: " + e.getMessage());
    }finally{
        sc.close();
        System.out.println("Program ended");
    }
    }
}
