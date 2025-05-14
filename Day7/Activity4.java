//String Analysis
package Day7;

public class Activity4 {
    public static void main(String[] args) {
        //Task 9: Write a method countVowels(String str) that counts and returns the number of vowels in a given string. Call the method using your full name.
        String fullName = "Prerna Khanna";
        int vowelCount = countVowels(fullName);
        System.out.println("Number of vowels in \"" + fullName + "\": " + vowelCount);
        //task 10: Write a method isPalindrome(String str) that checks if a given string is a palindrome. Test it with a few examples like "madam", "racecar", and "hello".
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
    }
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void testPalindrome(String word) {
        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }

}
