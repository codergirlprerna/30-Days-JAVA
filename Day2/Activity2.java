//Relational Operator

package Day2;

public class Activity2 {
    public static void main(String[] args) {
        //task4:compare two integer using >,<,==, and !=,then print the results.
        int a=5;
        int b=7;
        System.out.println("Comparision of two number: " + a + " and " + b + " : " + (a>b));
        System.out.println("Comparsion of two number: " + a + " and " + b + " : " + (b<a));
        System.out.println("Checking if two number are equal: " + a + " and " + b + " : " + (a==b));
        System.out.println("Checking if two number are not equal: " + a + " and " + b + " : " + (a!=b));

        //task5:compare two doubles using >= and <= and print whether the condition is true or false.
        double c=6;
        double d=5;
        System.out.println("Comparision of two number: " + c + " and " + d + " : " + (c>=d));
        System.out.println("Comparision of two number: " + c + " and " + d + " : " + (c<=d));
    }
}
