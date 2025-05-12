//Static vs non-static method.
package Day5;

public class Activity6 {
    public static void sayHello(){
        System.out.println("Hello from static method");
    }
    public void sayHi(){
        System.out.println("Hi from instance method");
    }
    public static void main(String[] args) {
        //Task 12: Write a static method sayHello() that prints “Hello from static method.”
        Activity6.sayHello();
        Activity6 obj = new Activity6();
        obj.sayHi();
    }
}
