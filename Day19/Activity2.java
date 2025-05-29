//Logical Error and unexpected output
package Day19;

public class Activity2 {
    public static void main(String[] args) {
        /*Task 3: Write a method to calculate the square of a number, but incorrectly multiply by 3.
→ Goal: Debug logic to correct the method.*/
/*Task 4: Create a loop that prints numbers from 1 to 5 but accidentally skips 5.
→ Goal: Modify loop condition to fix output.
 */
int result = square(4);
System.out.println("Square of a number is: " + result);
for(int i=1;i<=5;i++){
    System.out.println("Number from 1 to 5 are: " + i);
}
    }   
    public static int square(int a){
        return a*a;
    }
   

}
