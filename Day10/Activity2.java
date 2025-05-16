//Constructor and Validation

package Day10;
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Age must be positive");
        }
    }
    public int getAge(){
        return age;
    }
}

public class Activity2 {
    public static void main(String[] args) {
       // Task 5: Add a constructor to initialize name and age with encapsulated fields.
       Person p1 = new Person("prerna", 23);
       System.out.println("Name of the person is: " + p1.getName());
       System.out.println("Age of the person is: " + p1.getAge());
      // Task 6: Add validation in setAge() to ensure age is positive. Print an error message if invalid.
      //Task 7: Try setting an invalid age and observe the result.

      Person p2 = new Person("Aman", -28);
      System.out.println("Name of the person is: " + p2.getName());
      System.out.println("Age of the person is: " + p2.getAge());

    }
}
