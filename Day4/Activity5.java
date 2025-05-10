//Loop Control-break

package Day4;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        //task11:use a for loop to print a number from 1 to 10 and print only even number.But break when number is equal to 5
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            if(i%2==0){
                System.out.println("Number is even: " + i);
            }
        }

        //task12:use do while to print number but stop reading input when the user enter a negative number.
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter a number (negative to stop)");
            number=sc.nextInt();

            if(number>=0){
                System.out.println("You entered a number " + number);
            }
        }while(number>=0);
        System.out.println("Negative number entered.Exiting");
    }
}
