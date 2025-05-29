//Debugging with IDE breakpoint
package Day19;

public class Activity4 {
    public static void main(String[] args) {
        /*Task 7: Open a program in your IDE and set a breakpoint on a method call.
→ Goal: Run in debug mode and inspect local variables at the breakpoint.*/
/*Task 8: Step through the code line by line using Step Over (F6) and observe flow control.
→ Goal: Understand the exact order of execution.
 */
/*Task 9: Use Step Into (F5) to enter a method and debug its internal logic.
→ Goal: Trace values within method calls.
 */
/* Task 10: Use the “Watches” panel to track variable values during debugging.
→ Goal: Identify variable changes over execution*/
 
int a=10;
int b=5;
int result = multiply(a,b);

System.out.println("Result is: " + result);
    }
public static int multiply(int a,int b){
    return a*b;
}
}
