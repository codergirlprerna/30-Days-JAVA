//Objects as Parameter and return type

package Day8;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    int getBirthYear(){
        return 2025-this.age;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + 
        ", Age: " + this.age +
        ", Birth Year: " + this.getBirthYear();
    }

}

public class Activity5 {
    public static void printPersonDetails(Person p){
        System.out.println(p);
    }

    public static Person createPerson(String name,int age){
        return new Person(name, age);
    }
    public static void main(String[] args) {
        //Task 11: Create a method printPersonDetails(Person p) that receives a Person object and prints its details.
        //Task 12: Create a method createPerson(String name, int age) that returns a new Person object and use it to create and print a new object.
        Person p1 = new Person("Prerna", 23);
        Person p2 = new Person("Sunil", 27);
        Person p3 = new Person("Aman", 29);
        printPersonDetails(p1);
        printPersonDetails(p2);
        printPersonDetails(p3);

        Person newPerson = createPerson("Vikas",23);
        printPersonDetails(newPerson);

    }
}
