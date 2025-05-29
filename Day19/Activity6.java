//Conditional BreakPoint and tracktree analysis
package Day19;

public class Activity6 {
    public static void main(String[] args) {
        /*Task 13: Set a conditional breakpoint (e.g., stop only if a variable equals a certain value).
→ Goal: Focus debugging on specific scenarios.*/
/*Task 14: Trigger an exception and analyze the stack trace to determine the exact line and method where it occurred.
→ Goal: Navigate from the error trace to the source of the problem.
 */
for(int i=0;i<10;i++){
    System.out.println("i = " + i);
}
try{
    int result = divide(10,0);
    System.out.println("Result is: " + result);
}catch(Exception e){
e.printStackTrace();
}
    }
    public static int divide(int a,int b){
    return a/b;
    }
}
