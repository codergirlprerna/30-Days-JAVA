//Real World use

package Day16;

import java.util.HashMap;
import java.util.Map;

public class Activity3 {
  public static void main(String[] args) {
    //Task 9: Create a program that stores and retrieves student grades using a Map. Add logic to calculate average marks.
    Map<String,Integer> studentMarks = new HashMap<>();
    studentMarks.put("Aman",45);
    studentMarks.put("Sunil",98);
    studentMarks.put("Adi",80);

    System.out.println("Student Grades: ");
    for(Map.Entry<String,Integer> entry : studentMarks.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    int totalMarks = 0;
    for(int grade:studentMarks.values()){
        totalMarks+=grade;
    }
    double average = (double)totalMarks/studentMarks.size();
    System.out.println("Average marks: "+ average);
  }  
}
