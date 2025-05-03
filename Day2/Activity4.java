//Ternary Operator

package Day2;

public class Activity4 {
    public static void main(String[] args) {
        //use ternary operator to check weather a guven number is odd or even.
        int n=4;
       String result =  (n%2 == 0)?"even":"odd";
       System.out.println("Number is : " + result );
    }
}
