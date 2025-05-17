//Method overridding-(runtime polymorphism)
package Day11;
class Shape{
    public void area(){
        System.out.println("Area of shape is undefined.");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        double result=Math.PI*radius*radius;
        System.out.println("Area of circle is : " + result);
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
     @Override
     public void area(){
        double result=length*breadth;
        System.out.println("Area of rectangle is: " + result);
     }
}

class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void area(){
        double result= 0.5*base*height;
        System.out.println("Area of triangle is: " + result);

    }
}


public class Activity2 {
    public static void main(String[] args) {
        //task3: Create a class Shape with a method area().
        //Task 4: Create subclasses Circle, Rectangle, and Triangle, each overriding area().
        //Task 5: Create a Shape reference pointing to each subclass and call area() to observe dynamic dispatch.
        Shape shp = new Shape();
        shp = new Circle(5);
        shp.area();

        shp = new Rectangle(2, 4);
        shp.area();

        shp = new Triangle(2, 8);
        shp.area();
        


    }
}
