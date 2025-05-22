//Input Validation and Propagation
package Day13;

public class Activity4 {
    public static void validateInput(String input) throws IllegalArgumentException{
        if(input==null || input.trim().isEmpty()){
            throw new IllegalArgumentException("Input cannot be empty or null");
        }
    }
    public static void processInput(String input) throws IllegalArgumentException {
        validateInput(input);
        System.out.println("Processing input: " + input);
    }

   public static void main(String[] args) {
    //Task 9: Write a method validateInput(String input) that throws an exception if input is null or empty.
    String testInput = "";
    String userInput = "";
    try{
        validateInput(testInput);
        System.out.println("Input is valid: " + testInput);
    }catch(IllegalArgumentException e){
        System.out.println("Validation Failed: " + e.getMessage());
    }
    System.out.println("------------------------");
    try{
        processInput(userInput);
    }catch(IllegalArgumentException e){
        System.out.println("Error: " + e.getMessage());
    }
    System.out.println("Program Ended");
   } 
}
