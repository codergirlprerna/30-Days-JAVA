//Java 8 Features:Functional and Lamda Interface
package Day17;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
        interface Calculator{
            int operation(int a,int b);
        }

public class Activity1 {
    public static void main(String[] args) {
        //Task 1: Create a Runnable using a lambda expression and run it in a thread.
        //Task 2: Define your own functional interface (e.g., Calculator) and implement it using a lambda
        //Task 3: Use List.forEach() with a lambda to print each element of a list.

        Runnable Task = ()->{
            for(int i=1;i<5;i++){
                System.out.println("Running task in thread: " + i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(Task);
        thread.start();

        System.out.println("Main thread is running...");

        Calculator add = (a,b)-> a + b;
        Calculator subtract = (a,b)-> a-b;
        Calculator multiply = (a,b)->a*b;
        Calculator divide = (a,b)->a/b;

        int x=20,y=10;
        System.out.println("Addition: " + add.operation(x, y));
        System.out.println("Subtraction: " + subtract.operation(x,y));
        System.out.println("Multiplication: " + multiply.operation(x, y));
        System.out.println("Division: " + divide.operation(x, y));

        List<String> fruits = Arrays.asList("apple","mango","banana");
        System.out.println("Fruits in the list");
        fruits.forEach(fruit->System.out.println(fruit));
    }
}
