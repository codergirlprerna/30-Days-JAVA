//For loops Basics

package Day4;

public class Activity1 {
    public static void main(String[] args) {
        //task1:use a for loop to print a number from 1 to 10.
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //Task 2: Use a for loop to calculate and print the sum of numbers from 1 to 100.
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
         System.out.println("Sum of number from (1-100): " + sum);

        //Task 3: Use a for loop to print all prime numbers under 50.
        System.out.println("Print number under 50 are");
        for(int i=2;i<50;i++){
            boolean isPrime = true;
        

        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print(i + " ");
        }
    }

    }
}
