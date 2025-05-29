//Using print statement for debugging
package Day19;

public class Activity3 {
    public static void main(String[] args) {
        /*Task 5: Insert System.out.println() at different stages in a loop to trace execution flow.
→ Goal: Observe loop iterations and debug unexpected behavior.
 */
/*Task 6: Add print statements to trace values of variables inside a conditional structure (e.g., if-else).
→ Goal: Identify why a particular block is or isn't executed.
 */
int i=1;
while(i<=5){
    System.out.println("Start of the loop is: " + i);
i++;
    System.out.println("End of the loop is: " + i);
}

int num=0;
if(num>0){
    System.out.println("Inside if block");
    System.out.println("Number is positive");
}else if(num<0){
    System.out.println("Inside else-if block");
    System.out.println("Number is negative");
}else{
    System.out.println("Inside second else-if block");
    System.out.println("Number is zero");
}
    }
}
