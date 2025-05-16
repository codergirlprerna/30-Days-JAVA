//Static Members and toString method
package Day8;
class Person{
    String name;
    int age;

    static int count=0;

    Person(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }
    int getBirthYear(){
        return 2025-this.age;
    }
    void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("BirthYear: " + this.getBirthYear());
        System.out.println("--------------------------------");
    }

    @Override
    public String toString(){
        return "Name: " + this.name +
        ", Age: " + this.age + 
        ", Birth Year: " + this.getBirthYear();
    }
}

public class Activity4 {
    public static void main(String[] args) {
        //Task 8: Define a static field count in the Person class to track how many objects have been created.
       // Task 9: Update the constructor to increment count and print the total count after creating all objects.
       //Task 10: Override the toString() method in the Person class to return a formatted string of the person’s details.


        Person p1 = new Person("Prerna", 23);
        Person p2 = new Person("Aman", 29);
        Person p3 = new Person("Sunil", 27);
        //p1.printDetails();
        //p2.printDetails();
        //p3.printDetails();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Total person object created : " + Person.count);

    }
}
