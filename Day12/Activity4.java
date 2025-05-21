package Day12;
@FunctionalInterface
interface Operation{
    int execute(int a,int b);
}
public class Activity4 {
    public static void main(String[] args) {
        //Task 13: Define a functional interface Operation with a method execute(int a, int b).
       //Task 14: Use a lambda expression to implement Operation for addition, subtraction, and multiplication.
       //Task 15: Call execute() using different lambda implementations and print the results
       Operation addition = (a,b)->a+b;
       Operation subtraction = (a,b)->a-b;
       Operation mutliplication=(a,b)->a*b;

       System.out.println("Addition of two number is: " + addition.execute(3, 4));
       System.out.println("Subtraction of two number is: " + subtraction.execute(5, 2));
       System.out.println("Multiplication of two number is: " + mutliplication.execute(3, 5));




    }
}
