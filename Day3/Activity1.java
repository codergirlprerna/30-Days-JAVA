//Basic if-else Conditions

package Day3;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        //task1:check if a number is positive,negative and zero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Number is Positive");
        }else if(a<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }

        //task2:Compare two integers and print which one is greater or if they are equal.
        System.out.println("Please enter a number:");
        int b=sc.nextInt();
        System.out.println("Please enter a number:");
        int c=sc.nextInt();
        if(b>c){
            System.out.println("Number is greater " + b);
        }else if(b==c){
            System.out.println("Number is equal");
        }else{
            System.out.println("Number is not equal");
        }

        //task3:input marks and use if-else to assign a grade (A for >=90 , B for >=75 , C for >=60 ,else fail)
        System.out.println("Enter your marks.");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=75){
            System.out.println("B");
        }else if(marks>=60){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }

    }
}
