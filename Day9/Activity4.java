//Type Checking
package Day9;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void describe() {
        System.out.println("This is an animal named " + name + ", age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

class Puppy extends Dog {
    String trainingLevel;

    Puppy(String name, int age, String breed, String trainingLevel) {
        super(name, age, breed);
        this.trainingLevel = trainingLevel;
    }

    public void play() {
        System.out.println(name + " is playing. Training Level: " + trainingLevel);
    }
}

public class Activity4 {
    public static void main(String[] args) {
        //Task 11: Use instanceof to check whether an object is an instance of Dog, Animal, or Puppy.
        Animal a = new Animal("Animal", 5);
        Dog d = new Dog("Tommy", 3, "Labrador");
        Puppy p = new Puppy("Max", 1, "Golden Retriever", "Beginner");

        System.out.println("a instanceof Animal: " + (a instanceof Animal));
        System.out.println("a instanceof Dog: " + (a instanceof Dog));
        System.out.println("a instanceof Puppy: " + (a instanceof Puppy));

        System.out.println("d instanceof Animal: " + (d instanceof Animal));
        System.out.println("d instanceof Dog: " + (d instanceof Dog));
        System.out.println("d instanceof Puppy: " + (d instanceof Puppy));

        System.out.println("p instanceof Animal: " + (p instanceof Animal));
        System.out.println("p instanceof Dog: " + (p instanceof Dog));
        System.out.println("p instanceof Puppy: " + (p instanceof Puppy));


    }
}
