//Collections:Set and Map
package Day16;

import java.util.HashMap;
import java.util.Map;

public class Activity2 {
    public static void main(String[] args) {
        //Task 3: Create a HashMap<String, Integer> for student names and marks.
       //Task 4: Retrieve a student's mark by key using get().
       //Task 5: Use containsKey() to check if a student exists in the map.
       //Task 6: Iterate through map entries using for-each loop and print key-value pairs.
       //Task 7: Remove a specific entry and print the updated map.
       //Task 8: Merge two HashMap<String, String> objects (e.g., country-capital pairs).





        HashMap<String,Integer> student = new HashMap<>();
        student.put("Aman", 45);
        student.put("Sunil", 98);
        student.put("Adi", 80);

        System.out.println(student.get("Aman"));

        System.out.println(student.containsKey("Sunil"));
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
       
        student.remove("Aman");
        System.out.println(student);

        HashMap<String,String> countries = new HashMap<>();
        countries.put("India", "Delhi");
        countries.put("America","Washington DC");
        countries.put("Japan", "Tokyo");
        countries.put("Canada", "Ottawa");

        System.out.println(countries);


    }
}
