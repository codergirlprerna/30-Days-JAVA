//Strings and Text Handling

package Day1;

public class Activity3 {
    public static void main(String[] args) {
        //task5:declare a string variable assign it a sentence and print the value.
        String s = "I am  prerna and I am 24 years old.";
        System.out.println("Sentence is : " + s);

        //task6:Concatenate an int,double,boolean and string into one string and print the result.
        int number=42;
        double price = 99.99;
        boolean isAvailable = true;
        String name = "JAVA";
        
        String result = number + " " + price + " " + isAvailable + " " + name;
        System.out.println("Concatenated String: " + result);
        
    }
}
