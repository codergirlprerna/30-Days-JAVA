//Nested if-statement

package Day3;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        //Task 9: Input three numbers and find the greatest using nested if conditions.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            if(a>b){
                System.out.println("a is greator");
            }else{
                System.out.println("b is grator");
            }
        }else if(a>c){
            System.out.println("a is greator");
        }else{
            System.out.println("c is greator");
        }

        //Task 10: Input age and citizenship status; check if a person is eligible to vote using nested if
        System.out.println("Enter your age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your CitizenShip Status");
        String citizenShip = sc.nextLine();
        if(age>=18){
            if(citizenShip.equalsIgnoreCase("Indian")){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote due to citizenship");
            }
        }else{
            System.out.println("You are not eligible to vote due to age");
        }
    }
}
