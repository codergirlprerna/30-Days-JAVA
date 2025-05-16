//Method Objects
package Day8;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void printDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Birthyear : " + this.getBirthYear() );
        System.out.println("-------------------------------");
    }

    int getBirthYear(){
        return 2025-this.age;
    }
}

public class Activity3 {
    public static void main(String[] args) {
       // Task 6: Create an array of 3 Person objects with different values and print their details.

        Person[] people = new Person[3];
        people[0]=new Person("Prerna", 23);
        people[1]=new Person("Sunil", 27);
        people[2]=new Person("Aman", 29);

        for(int i=0;i<people.length;i++){
            System.out.println("Person " + (i+1) + " Details:");
            people[i].printDetails();
        }

        //Task 7: Use the this keyword in the constructor and methods of the Person class to refer to instance variables.

    }
}
