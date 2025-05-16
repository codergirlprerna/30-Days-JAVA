//Creating Base and derived class

package Day9;
class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println(name + " makes a sound");
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
        System.out.println(name + " barks.");
    }

    void displayInfo(){
        System.out.println("Dog name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

public class Activity1 {
    public static void main(String[] args) {
        //Task 1: Create a class Animal with fields name and age, and a method makeSound().
        //Task 2: Create a subclass Dog that extends Animal and adds a field breed.
        //Task 3: Instantiate a Dog object and print its name, age, and breed.

        Animal a1 = new Animal("Cat", 5);
        System.out.println("Animal name: " + a1.name);
        System.out.println("Age is: " + a1.age);
        a1.makeSound();

        Dog d1 = new Dog("Tommy", 3, "Labrador");
        d1.displayInfo();
        d1.makeSound();

        Dog d2 = new Dog("Bruno", 5,"German Shepherd" );
        d2.displayInfo();
    }
}
