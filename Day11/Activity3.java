//toStrings and Arrays
package Day11;
class Shape{
    public void area(){
        System.out.println("Area of shape is undefined.");
    }
     @Override
    public String toString() {
        return "Generic Shape";
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
     @Override
    public String toString() {
        return "Circle [radius = " + radius + "]";
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
     @Override
     public void area(){
        double result=length*width;
        System.out.println("Area of rectangle is: " + result);
     }
      @Override
    public String toString() {
        return "Rectangle [length = " + length + ", width = " + width + "]";
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
    @Override
    public String toString() {
        return "Triangle [base = " + base + ", height = " + height + "]";
    }

}
public class Activity3 {
    public static void main(String[] args) {
        //task 6: Override toString() in one of the shape classes to print details nicely.
        //Task 7: Create an array of Shape objects and iterate through them, calling area() and toString().

     /*Shape shp = new Shape();
        shp = new Circle(5);
        shp.area();
        System.out.println(shp.toString());

        shp = new Rectangle(2, 4);
        shp.area();

        shp = new Triangle(2, 8);
        shp.area();*/

        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(4);
        shapes[1]=new Rectangle(3, 4);
        shapes[2]=new Triangle(4, 2);

        for(Shape shape:shapes){
            shape.area();
            System.out.println(shape);
            System.out.println();
        }
    }
}
