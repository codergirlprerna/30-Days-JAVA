//Debugging Loop recursion
package Day19;

public class Activity7 {
    public static void main(String[] args) {
        /*Task 15: Create a program with an infinite loop (e.g., wrong loop condition).
→ Goal: Identify the issue and break out of the infinite loop.
 */
/*Task 16: Write a recursive method (e.g., factorial) and debug using breakpoints to understand the call stack.
→ Goal: Trace recursive calls and understand base cases.
 */
for(int i=0;i<10;i++){
    System.out.println("Value of i : " + i);
}
int result = recursion(5);
System.out.println("Recursion of 5 is: " + result);
    }

    public static int recursion(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        

        return fact;
        
    }
}
