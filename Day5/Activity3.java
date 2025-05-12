//Method Overloading

package Day5;

public class Activity3 {
    public static void main(String[] args) {
        //Task 6: Overload the addTwoNumbers() method to work with double values.
        int sumInt = addTwoNumbers(5,7);
        System.out.println("Addition of two number: " + sumInt);

        int sumDouble = addTwoNumbers(5,3);
        System.out.println("Addition of two number: " + sumDouble);
        String name = "prerna";
        System.out.println(getGreeting(name));
        System.out.println(getGreeting());

    }

    public static int addTwoNumbers(int a,int b){
        return a + b;
    }

    public static double addTwoNumbers(double a,double b){
        return a + b;
    }
    //task7:Overload the getGreeting() method to take no parameters and return "Hello, Guest!".
    public static String getGreeting(String name){
    return "Hello " + name;
    }

    public static String getGreeting(){
        return "Hello, Guest!"; 
    }


}
