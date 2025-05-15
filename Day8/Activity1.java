//Creating Classes and Objects
package Day8;
class Person{
    String name;
    int age;

    Person() {
        this.name = "Unknown";
        this.age = 0;
    }



    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Activity1 {
    public static void main(String[] args) {
        //task1:Create a class Person with two fields: name (String) and age (int).
        Person p1 = new Person();
        //task2: Instantiate a Person object and print its name and age
        p1.name = "Prerna";
        p1.age = 23;
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        //task3:Create a constructor in the Person class to initialize the fields, and use it when creating objects.
        Person p2 = new Person("Prerna", 22);
        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age);

        
    }
}
