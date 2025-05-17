//Abstract and interface polymorphism.
package Day11;
abstract class Appliance{
    abstract void turnOn();
}

 interface Playable{
    void play();
}
class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Fan is now on");
    }
}

class Light extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Light is now on");
    }
}

 class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Strumming the Guitar");
    }
}

 class piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing the piano");
    }
}
public class Activity4 {
    public static void main(String[] args) {
        //task1:Create an abstract class Appliance with an abstract method turnOn().
        //Task 9: Create classes Fan and Light that extend Appliance and implement turnOn().
        //Task 10: Use an Appliance reference to hold Fan and Light objects and call turnOn().
        //Task 11: Create an interface Playable with method play().
        //Task 12: Implement Playable in classes Guitar and Piano. Use a Playable reference to call play() for each.

        Appliance a1 = new Fan();
        Appliance a2 = new Light();
        a1.turnOn();
        a2.turnOn();

        Playable p1 = new Guitar();
        Playable p2 = new piano();
        p1.play();
        p2.play();



    }
}
