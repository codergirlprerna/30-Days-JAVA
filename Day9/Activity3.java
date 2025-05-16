//Constructor chaining and multilevel inheritance.

package Day9;
class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Animal constructor called:Name = " + name + "  , Age = " + age);
    }
    public void makeSound(){
        System.out.println(name + " makes a sound");
    }
    public void describe(){
        System.out.println("This is animal named " + name + ", age: " + age);
    }
}

class Dog extends Animal{
    String breed;
    Dog(String name,int age,String breed){
        super(name, age);
        this.breed=breed;
        System.out.println("Dog constructor called with breed: " + breed);
    }

    @Override
    public void makeSound(){
        System.out.println(name+" barks.");
    }

    public void fetch(){
        System.out.println(name + " is fetching the ball.");
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
        System.out.println("Breed is: " + breed);
    }
}

class Puppy extends Dog{
    String trainingLevel;
    Puppy(String name,int age,String breed,String trainingLevel){
        super(name, age, breed);
        System.out.println("Puppy Constructor called.");
        this.trainingLevel=trainingLevel;
        System.out.println("Training level: " + trainingLevel);
    }
    public void play() {
        System.out.println(name + " is playing. Training Level: " + trainingLevel);
    }
    void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Training level: " + trainingLevel);
    }
}

public class Activity3 {
   public static void main(String[] args) {
    //Task 8: Add a constructor to Animal and Dog to demonstrate constructor chaining.
    //Task 9: Create a subclass Puppy that extends Dog. Add a unique field like trainingLevel.
    //Task 10: Instantiate a Puppy and demonstrate multilevel inheritance by calling methods from all three classes.

    Dog d1 = new Dog("Bruno", 4, "Beagle");
    d1.displayInfo();
    System.out.println("--------------");

    Puppy pup = new Puppy("Bruno", 3, "Beagle", "Intermediate");
    pup.showDetails();
    System.out.println("---------------------");

    Puppy p = new Puppy("Max", 2, "Golden Retriver", "Beginner");
    p.displayInfo();
    p.makeSound();
    p.fetch();
    p.play();
   } 
}
