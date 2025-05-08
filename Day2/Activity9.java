//Operator Precedence and Parenthesis

package Day2;

public class Activity9 {
    public static void main(String[] args) {
        //task16: Evaluate 5+3*2 and print the result to demonstrate precedence.
        int result = 5+3*2;
        System.out.println(result);

        //task17: use parenthesis to override precedence:(5+3)*2 and print the result.
        int results = (5+3)*2;
        System.out.println(results);
    }
}
