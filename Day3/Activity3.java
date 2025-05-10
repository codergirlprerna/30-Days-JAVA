package Day3;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        //task6:Input a number(1-7) and print the corresponding weekday using switch-case.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(1-7):");
        int num=sc.nextInt();
        switch(num){
            case 1:
                 System.out.println("Monday");;
                 break;
            case 2:
                 System.out.println("Tuesday");
                 break;
            case 3:
                 System.out.println("Wednesday");
                 break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number! Please enter a number between (!-7)");
                break;
        }

        //task7:Match multiple cases for weekend (Saturday and Sunday) and print “Weekend” or “Weekday”.
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input! Enter a number from to 1-7 ");
        }

    }
}
