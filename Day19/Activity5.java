//Null POinter exception and common runtime error
package Day19;

public class Activity5 {
  public static void main(String[] args) {
    /*Task 11: Create a program that tries to access a method on a null object reference.
→ Goal: Reproduce and fix the NullPointerException.*/
/*Task 12: Simulate an ArrayIndexOutOfBoundsException by accessing an invalid index.
→ Goal: Identify and fix the index logic.
 */
String message = "Hello, Debugging!";
System.out.println("Length is: " + message.length());
int[] arr = new int[3];
System.out.println(arr[2]);
  }  
}
