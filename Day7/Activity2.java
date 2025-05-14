//String Manipulation
package Day7;

public class Activity2 {
    public static void main(String[] args) {
        //task4:Replace all vowels in the string from task1 with character * and print the result.
        String name = "Prerna Khanna";
        String modifiedName = name.replaceAll("(?i)[aeiou]", "*");
        System.out.println("Original String: " + name);
        System.out.println("Modified String: " + modifiedName);

        //Task 5: Extract and print a substring containing only your first name from the full name string.
        String firstName = name.substring(0, name.indexOf(" "));
        System.out.println("First Name: " + firstName);

        //Task 6: Compare two strings using .equals() and == operator and explain the result.
        String str1 = new String("Prerna");
        String str2 = new String("Prerna");
        boolean isEqualUsingEquals = str1.equals(str2);
        boolean isEqualUsingDoubleEquals = (str1 == str2);
        System.out.println("Using .equals(): " + isEqualUsingEquals); 
        System.out.println("Using == operator: " + isEqualUsingDoubleEquals);










    }
}
