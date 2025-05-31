package Day20;
/*class Engine{
    private String type;
    private int horsePower;

    Engine(String type,int horsePower){
        this.type=type;
        this.horsePower=horsePower;
    }
    public void displayEngineInfo(){
        System.out.println("Engine type: " + type);
        System.out.println("HorsePower: " + horsePower);
    }
}
class Vehicle{
    String brand;
    int year;
    Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle{
    int numberOfDoors;
    Engine engine;//composition
    Car(String brand,int year,int numberOfDoors,Engine engine){
        super(brand, year);
        this.numberOfDoors=numberOfDoors;
        this.engine=engine;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        engine.displayEngineInfo();
    }
}*/
/*class Bike extends Vehicle{
    boolean hasCarrier;
    Bike(String brand,int year,boolean hasCarrier){
        super(brand, year);
        this.hasCarrier=hasCarrier;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}*/
interface Drivable{
    void drive();
}
interface Flyable{
    void fly();
}
interface Sailable{
    void sail();
}
class Car implements Drivable{
    public void drive(){
        System.out.println("Car is driving on the road");
    }
}
class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplane is flying in the sky");
    }
}
class Boat implements Sailable{
    public void sail(){
        System.out.println("Boat is sailing in the water");
    }
}

final class Person{
    private final String name;
    private final int age;

    public Person(String name,int age){
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Person{name='" + name + "' , age=" + age + "}";
    }

}
public class Activity5 {
    public static void main(String[] args) {
        //Task 21: Create a base class Vehicle and subclasses Car, Bike, using inheritance and constructors.
       //Task 22: Apply method overriding and call superclass methods using super.
       //Task 23: Implement composition (e.g., a Car has an Engine) and demonstrate its benefits over inheritance.
      //Task 24: Use interface segregation to break down a large interface into smaller ones.
     //Task 25: Design an immutable class with final fields and no setters.
     /*Bike bike  = new Bike("Yamaha", 2015, true);
     System.out.println(" === Bike Info ===");
     bike.displayInfo();
     Engine carEngine = new Engine("Petrol", 120);
     Car car = new Car("Toyota", 2019, 4,carEngine);

     System.out.println("=== Car Info with Engine ===");
     car.displayInfo();*/
     Car car = new Car();
     car.drive();

     Airplane air = new Airplane();
     air.fly();

     Boat boat = new Boat();
     boat.sail();
     Person person = new Person("aman", 25);
     System.out.println(person);


    }
}
