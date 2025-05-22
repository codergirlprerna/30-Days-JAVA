//Object Serialization
package Day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Activity3 {
    public static void main(String[] args) {
        //Task 8: Create a Student class with name and grade fields.
        //Task 9: Serialize a Student object to a file using ObjectOutputStream.
        //Task 10: Deserialize the file to recreate the Student object using ObjectInputStream.
        //Task 11: Handle IOException and ClassNotFoundException appropriately.

        Student student =new Student("aman", 89.5);
        try{
            FileOutputStream fileout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(student);
            out.close();
            fileout.close();
            System.out.println("Student Object has been serialized to 'student.ser");
        }catch(IOException e){
            System.out.println("Error occured during serialization");
            e.printStackTrace();
        }


        try{
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Student Object has been deserialized");
            deserializedStudent.displayInfo();
        }catch(IOException e){
            System.out.println("Error occured during deserialization");
            System.out.println("IOException: " + e.getMessage());

            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Student class not found");
            System.out.println("ClassNotFoundException: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
