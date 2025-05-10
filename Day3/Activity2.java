//Leap year and range validation

package Day3;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        //task4:Check if given year is leap year using if-else logic.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year which you want to check");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
            System.out.println("Year is leap year");
        }else{
            System.out.println("Year is not leap year");
        }

        //task5:Validate if a number is in the range(1-100) and print the message accordingly.
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num>=1 && num<=100){
            System.out.println("Number is within the range");
        }else{
            System.out.println("Number is not in the range");
        }

    }
}
