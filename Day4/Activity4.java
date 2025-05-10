//Loop Control continue

package Day4;

public class Activity4 {
    public static void main(String[] args) {
        //task9:use a for loop with continue to skip odd number from 1 to 10 and print only even number.
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even Number : " + i);
            }
            continue;
        }
        //task10:use a while loop to skip number divisible by 3 and print the rest from 1 to 20.
        int num=1;
        while(num<=20){
            if(num%3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
