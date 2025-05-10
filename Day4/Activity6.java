//Nested Loop and pattern.

package Day4;

public class Activity6 {
    public static void main(String[] args) {
        /*task13:Use nested loop to print a number traingle.
        1
        12
        123
        1234*/
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*task14:Use nested for loop to print star pattern
        *
        **
        ***
        ****
        ***** */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
