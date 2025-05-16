//Working with private fields.
package Day10;
class Person{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int age(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }    
}
public class Activity1{
    public static void main(String[] args) {
        //Task 1: Create a class Person with private fields name and age.
        //Task 2: Add public getter and setter methods for each field.
       // Task 3: Attempt to access name directly from another class (expect a compilation error).
       //Task 4: Set and get values using setters and getters, and print them
       Person p1 = new Person();
       //p1.name();
       p1.setName("Prerna");
       p1.setAge(23);

       System.out.println("Name of the person is: " + p1.getName());
       System.out.println("Age of the person is: " + p1.age());
       
       

    }
}