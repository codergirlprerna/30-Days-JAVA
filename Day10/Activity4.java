//creating an immutable class
package Day10;
class Student{
    private final String name;
    private final int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class Activity4 {
    public static void main(String[] args) {
        //Task 11: Create a class Student with final fields id and name.
        Student s1 = new Student("Prerna", 101);
        System.out.println("Student name: " + s1.getName());
        System.out.println("Student id : " + s1.getId());
    }
}
