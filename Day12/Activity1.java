//Abstract Classes and Methods.
package Day12;
abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double calculateArea(){
        return length*width;
    }
}
public class Activity1{
    public static void main(String[] args) {
        //Task1: Create an abstract class Shape with an abstract method calculateArea().
        //Task 2: Extend Shape into a class Circle. Add a field radius and implement calculateArea().
        //Task 3: Extend Shape into a class Rectangle. Add fields length and width, and implement calculateArea().
        //Task 4: Instantiate Circle and Rectangle objects, call calculateArea() for each, and print the results.



        Circle circle = new Circle(5);
        System.out.println("Area of circle " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

    }
}