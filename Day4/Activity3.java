//do-while loop use cases

package Day4;

import java.util.Scanner;

public class Activity3 {
   public static void main(String[] args) {
    //task7:use do-while loop to continuously read input until user type "exit".
    Scanner sc = new Scanner(System.in);
    String input;
    do{
        System.out.println("Enter input (type 'exit' to quit)");
        input=sc.nextLine();
    }while(!input.equalsIgnoreCase("exit"));
    System.out.println("Programs Terminated");
    sc.close();

    //task8:Use do while loop to print a number form 1 to 5.
    int i=1;
    do{
        System.out.println(i);
        i++;
    }while(i<=5);

   } 
}
