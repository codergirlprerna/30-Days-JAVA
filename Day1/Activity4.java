//Type Casting

package Day1;

public class Activity4 {
    public static void main(String[] args) {
        //task7: Perform implicit casting from int to double,assign and print the result.
        int intValue = 25;
        double doubleValue = intValue;
        System.out.println("Integer Value : " + intValue);
        System.out.println("Implicitly casted double value : " + doubleValue);

        //task8: Perform explicit casting from double to int,assign and print the result.
        double doubledValue = 99.99;
        int intVal = (int)doubledValue;
        System.out.println("Original double value : " + doubledValue);
        System.out.println("Explicitly casted int value : " + intVal);

    }
    
}
