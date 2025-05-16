//Adding Methods
package Day8;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    int getBirthYear(){
        return 2025 - this.age;
    }
}

public class Activity2 {
    public static void main(String[] args) {
        //task4:Add a method getBirthYear() in the Person class that returns the birth year, assuming the current year is 2025.
        Person p1 = new Person("Prerna",23);
        System.out.println("Name of Person: " + p1.name);
        System.out.println("Age of person: " + p1.age);

        System.out.println("Birth year : " + p1.getBirthYear());
        //Task 5: Call the getBirthYear() method for an object and print the result.
        int birthYear = p1.getBirthYear();
        System.out.println("Age of a person is: " + birthYear);
    }
}
