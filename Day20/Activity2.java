package Day20;
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

public class Activity2 {
    public static void main(String[] args) {
        //Task 6: Explore String, StringBuilder, and StringBuffer. Compare their performance in a loop.
       //Task 7: Show how equals() and == behave differently with strings and other objects.
       //Task 8: Implement a method to check if a string is a palindrome, ignoring spaces and case.
       //Task 9: Build a custom method that performs a manual string reversal without using built-in methods.
       //Task 10: Explain and demonstrate String immutability with before-after modification scenarios.
       int iterations = 100_000;
       long start = System.currentTimeMillis();
       String s = "";
       for(int i=0;i<iterations;i++){
        s+=i;
       }
       long end = System.currentTimeMillis();
       System.out.println("Time taken by String: " + (end-start) +"ms");

       start = System.currentTimeMillis();
       StringBuilder sb  = new StringBuilder();
       for(int i=0;i<iterations;i++){
        sb.append(i);
       }
       end=System.currentTimeMillis();
       System.out.println("Time taken by StringBuilder: " + (end-start) + "ms");

       start = System.currentTimeMillis();
       StringBuffer sbf = new StringBuffer();
       for(int i=0;i<iterations;i++){
        sbf.append(i);
       }
       end = System.currentTimeMillis();
       System.out.println("Time taken by StringBuffer: " + (end-start) + "ms");

       String s1 = "Hello";
       String s2 = "Hello";
       String s3 = new String("Hello");

       System.out.println(s1==s2);
       System.out.println(s1==s3);
       System.out.println(s1.equals(s3));

       Person p1 = new Person("Alice");
       Person p2 = new Person("Alice");
       System.out.println(p1==p2);
       System.out.println(p1.equals(p2));

       String test1 = "A man a Plan a canal Panama";
       String test2 = "Hello World";
       System.out.println("\"" + test1 + "\" is Palindrome? " + isPalindrome(test1));
       System.out.println("\"" + test2 + "\" is Palindrome? " + isPalindrome(test2));
       
       String original = "OpenAI";
       String reversed = reverseString(original);
       System.out.println("Original String is: " + original);
       System.out.println("Reversed String is: " + reversed);

       String Original = "hello";

       System.out.println("Before Modification:");
       System.out.println("Original: " + Original);
       System.out.println("Original Hashcode: " + System.identityHashCode(Original));

       String modified = Original + "World";
       System.out.println("\nAfter Modification:");
       System.out.println("Original: " + Original);
       System.out.println("Modified: " + modified);
       System.out.println("Original hashcode: " + System.identityHashCode(Original));
       System.out.println("Modified hashcode: " + System.identityHashCode(modified));

      

    }
    public static boolean isPalindrome(String input){
        String cleaned = input.replaceAll("\\s+","").toLowerCase();
        int left=0;
        int right = cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String reverseString(String input){
         char[] chars = input.toCharArray();
       int left = 0;
       int right = chars.length-1;

       while(left<right){
        char temp = chars[left];
        chars[left]=chars[right];
        chars[right]=temp;

        left++;
        right--;
       }
       
       return new String(chars);
    }
}
