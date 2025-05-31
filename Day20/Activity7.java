package Day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class InvalidTransactionException extends Exception{
    public InvalidTransactionException(String message){
        super(message);
    }
}
class BankAccount{
    private double Balance;
    public BankAccount(double initialBalance){
        this.Balance = initialBalance;
}

public void withdraw(double amount) throws InvalidTransactionException{
    if(amount<=0){
        throw new InvalidTransactionException("Amount must be greator than zero.");
    }
    if(amount>Balance){
        throw new InvalidTransactionException("Insufficient Balance");
    }
    Balance-=amount;
    System.out.println("Withdrawal successful.Remaining balance: $" + Balance);
}
public void deposit(double amount) throws InvalidTransactionException{
    if(amount<=0){
        throw new InvalidTransactionException("Deposit amount must be positive");
    }
    Balance+=amount;
    System.out.println("Deposit successful.New Balance: $" + Balance);
}
public double getBalance(){
    return Balance;
}
}

class CustomException extends Exception{
    public CustomException(String message,Throwable cause){
        super(message,cause);
    }
}
public class Activity7 {
        private static final Logger LOGGER = Logger.getLogger(Activity7.class.getName());

    public static void main(String[] args) {
        //Task 31: Create a custom exception InvalidTransactionException and throw it under certain conditions.
       //Task 32: Wrap a risky operation in try-catch and log exception using Logger.
       //Task 33: Use try-with-resources to read from a file and ensure automatic resource management.
      //Task 34: Demonstrate exception chaining using throw new CustomException("msg", e).
      //Task 35: Build a method that validates user input (e.g., age) and throws IllegalArgumentException
      BankAccount account = new BankAccount(1000);
       try {
            account.deposit(500);        
            account.withdraw(300);  
            account.withdraw(2000);      
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        try {
            account.deposit(-100);     
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        String input = "123a";
        try{
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        }catch(NumberFormatException e){
            LOGGER.log(Level.SEVERE,"Failed yo parse integer from input: " + input,e);
        }
        try{
            int result = divide(10,0);
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            LOGGER.log(Level.WARNING,"Arithmetic error accured ",e);
        }
        System.out.println("==== Task 32 completed ====");

        String filepath = "sample.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath)))
        {
            String line;
            System.out.println(" === File Content ===");
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("Error reading file " + e.getMessage());
        }

        System.out.println("=== Task 33 Completed ===");
        try{
            readData();
        }catch(CustomException e){
            System.out.println("Caught CustomException: " + e.getMessage());
            System.out.println("Original case: " + e.getCause());
        }
        System.out.println("=== Task 34 Completed ===");
        try{
            validateAge(25);
            validateAge(-5);
        }catch(IllegalArgumentException e){
            System.err.println("Caught Exception: " + e.getMessage());
        }

    }
    public static int divide(int a,int b){
        return a/b;
    }

    public static void readData() throws CustomException{
        try{
            int x=5/0;
        }catch(ArithmeticException e){
            throw new CustomException("Failed to read data due to arithmetic error",e);
        }
    }
    public static void validateAge(int age){
        if(age<0 || age>130 ){
            throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 130");
        }
        System.out.println("Valid age: " + age);
    }
}
