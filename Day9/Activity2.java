//Methdod Overriding and use of super
package Day9;
class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.println(name + " makes sound");
    }
    public void describe(){
        System.out.println("This is an animal named: " + name + " and it is " + age + " years old");
    }
}

class Dog extends Animal{
    String breed;
    Dog(String name,int age,String breed){
        super(name, age);
        this.breed=breed;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Barks.");
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
    public void describe(){
        super.describe();
        System.out.println("This dog is of breed " + breed);
    }
}
public class Activity2 {
    public static void main(String[] args) {
        //Task 4: Override the makeSound() method in Dog to print "Bark".
        //Task 5: Call the makeSound() method from a Dog object and observe the output.
        //Task 6: In Dog, call the parent constructor using super() and print a message from the parent class constructor.
        //Task 7: Create a method describe() in Animal and call it from Dog using super.describe().



        Dog d1 = new Dog("Bruno", 4, "German Shepherd");
        d1.displayInfo();
        d1.makeSound();
        d1.describe();
    }
}
