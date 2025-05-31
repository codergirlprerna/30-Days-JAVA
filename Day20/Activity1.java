//Mastering JAVA fundamentals
package Day20;
class Person{
    String name;
}
public class Activity1 {
    public static void main(String[] args) {
       // Task 1: Create a class demonstrating all primitive data types and their limits using Integer.MAX_VALUE, etc.
       //Task 2: Explore type casting (implicit and explicit) with examples of widening and narrowing conversions.
       //Task 3: Write a method to swap two numbers without using a third variable.
       //Task 4: Use ternary operator in different scenarios (max of 2 numbers, check even/odd, etc.).
       //Task 5: Demonstrate pass-by-value with primitive and object types, and explain the difference.


        byte b = 1;
        System.out.println("byte: " + b + " | Min: " + Byte.MIN_VALUE + " | Max: " + Byte.MAX_VALUE);

        short s = 2;
        System.out.println("short: " + s + " | Min: " + Short.MIN_VALUE + " | Max: " + Short.MAX_VALUE);

        int i = 10;
        System.out.println("int: " + i + " | Min: " + Integer.MIN_VALUE + " | Max: " + Integer.MAX_VALUE);

        long l = 100L;
        System.out.println("long: " + l + " | Min: " + Long.MIN_VALUE + " | Max: " + Long.MAX_VALUE);

        // Floating Point Types
        float f = 3.14f;
        System.out.println("float: " + f + " | Min: " + Float.MIN_VALUE + " | Max: " + Float.MAX_VALUE);

        double d = 3.14159265359;
        System.out.println("double: " + d + " | Min: " + Double.MIN_VALUE + " | Max: " + Double.MAX_VALUE);

        // Character
        char c = 'A';
        System.out.println("char: " + c + " | Min: " + (int) Character.MIN_VALUE + " | Max: " + (int) Character.MAX_VALUE);

        // Boolean
        boolean bool = true;
        System.out.println("boolean: " + bool + " | Values: " + Boolean.TRUE + " and " + Boolean.FALSE);
        int intVal = 100;
        long longVal = intVal;      
        float floatVal = longVal;   
        double doubleVal = floatVal; 

        System.out.println("int: " + intVal);
        System.out.println("long (from int): " + longVal);
        System.out.println("float (from long): " + floatVal);
        System.out.println("double (from float): " + doubleVal);

                double doubleVals = 99.99;
        float floatVals = (float) doubleVals;     
        long longVals = (long) floatVals;         
        int intVals = (int) longVals;             
        short shortVal = (short) intVals;        
        byte byteVal = (byte) shortVal;         

        System.out.println("double: " + doubleVal);
        System.out.println("float (casted): " + floatVal);
        System.out.println("long (casted): " + longVal);
        System.out.println("int (casted): " + intVal);
        System.out.println("short (casted): " + shortVal);
        System.out.println("byte (casted): " + byteVal);

        int a=5;
        int e=4;

        System.out.println("Value of a and e before swapping is: " + a + " and " + e);

        a=a+e;
        e=a-e;
        a=a-e;

        System.out.println("Value of a and e after swapping is: " + a + " and " + e);

        //max of two number with the help of ternary operator.
        int num1 = 4;
        int num2 = 6;
        int max = (num1>num2) ? num1 : num2;
        System.out.println("Maximum of two number is: " + max);

        //Odd and Even 
        int num=5;
        String toCheck = (num%2==0)?"even":"odd";
        System.out.println("Number is: " + toCheck);

        int original=5;
        modifyValue(original);
        System.out.println("Primitive after method call: " + original);

        Person p = new Person();
        p.name = "Alice";
        modifyPerson(p);
        System.out.println("Object after method call : " + p.name);


    }
    public static void modifyValue(int number){
        number = number+10;
    }

    public static void modifyPerson(Person person){
        person.name = "Bob";
        person = new Person();
        person.name = "John";
    }
}
