package Day5;

public class Activity7 {
    public static boolean isPrime(int number){
        if(number<=1) return false;
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
      // Task 14: Create a utility method isPrime(int number) that checks if a number is prime and returns a boolean. Use it in a loop to print all prime numbers from 1 to 100. 
      System.out.println("Prime number from 1 to 100");
      for(int i=1;i<=100;i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
      }
    }
}
