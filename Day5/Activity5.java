//Method calling another method

package Day5;

public class Activity5 {
    public static void main(String[] args) {
        //Task 10: Create a method reverseString(String input) that returns the reversed version of the string.
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("prerna"));
        System.out.println(printFact(5));
        System.out.println(printFact(9));
    }
    public static String reverseString(String input){
        char[] charArray= input.toCharArray();
        reverseCharArray(charArray);
        return new String(charArray);
    }
    public static void reverseCharArray(char[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
    //task 11: Create a recursive method factorial(int n) that returns the factorial of n.
    public static int printFact(int n){
        if(n==1) return 1;
        return n*printFact(n-1);
    }


}
