//Identifying and fixing Syntax error
package Day19;

public class Activity1 {
    public static void main(String[] args) {
        /*Task 1: Write a simple program to print “Hello, Debugging!” but introduce a syntax error (e.g., missing semicolon).
→ Goal: Identify and fix the compilation error.*/
/*Task 2: Create a method with incorrect return type or mismatched brackets.
→ Goal: Use the compiler error message to locate and fix the issue.
 */
System.out.println("Hello, Debugging!");
int result = add(5,3);
System.out.println("Addition is: " + result);
    }
    public static int add(int a,int b){
        System.out.println("Adding Numbers");
        return a+b;
    }
}
