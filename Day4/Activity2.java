//while loop application

package Day4;

public class Activity2 {
    public static void main(String[] args) {
        //task4:use a while loop to print all even number from 2 to 20.
        int n=2;
        while(n<=20){
            if(n%2==0){
                System.out.println("Number is even :" + n);
            }else{
                System.out.println("Number is odd :" + n);
            }
            n++;
        }
        //task5:use a while loop to reverse the digits of a number.
        int num=123;
        int temp=num;
        int rev=0;
        while(temp>0){
            int digit=temp%10;
            rev = rev*10+digit;
            temp=temp/10;
        }
        System.out.println("Number is reversed: " + rev);

        //task6: use while loop to calculate factorial of number.
        int fact=1;
        int number=5;
        int tem=number;
        while (number>0) {
            fact*=number;
            number--;
        }
        System.out.println("Factorial of a number" + tem + " is : " +  fact);
    }
}
