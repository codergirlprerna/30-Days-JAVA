//Methods and boolean returns

package Day5;

public class Activity2 {
    public static void main(String[] args) {
        //task 4: Write a method isEven(int number) that returns true if a number is even, otherwise false.
        int n=5;
        boolean result=isEven(n);
        System.out.println(result);
        String name = "mam";
        boolean palindrome = isPalindrome(name);
        System.out.println(palindrome);
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    //task 5: Write a method isPalindrome(String str) that returns true if the input string is a palindrome.
    public static Boolean isPalindrome(String name){
       name=name.replaceAll("\\s+","");
       int left=0;
       int right=name.length()-1;
       while(left<right){
        if(name.charAt(left)!=name.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}
