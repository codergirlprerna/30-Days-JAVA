//Strings

package Day7;
    public class Activity1{
        public static void main(String[] args) {
            //task1:create a string variable with your full name and print it.
            String name = "Prerna Khanna";
            System.out.println(name);
            //task 2: Find and print the length of the string created in Task 1.
            int len = name.length();
            System.out.println(len);
            //task 3: Convert the string to uppercase and lowercase, and print both versions.
            String str = name.toUpperCase();
            String strs = name.toLowerCase();
            System.out.println("Uppercase: " + str + "and " + "Lowercase: " + strs);

        }
    }
