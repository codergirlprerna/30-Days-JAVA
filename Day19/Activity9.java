//Debugging real-World scenario
package Day19;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Activity9 {
    private static final Logger logger = Logger.getLogger(Activity9.class.getName());
    public static void main(String[] args) {
        /*Task 19: Debug a program that calculates average marks but returns incorrect result due to integer division.
→ Goal: Use logging or debugging to find and fix the math error.*/
/*
Task 20: Debug a program that stores data in a Map but returns null on lookup due to key mismatch (e.g., case-sensitive issue).
→ Goal: Inspect the contents of the map and correct the logic */
/*logger.setLevel(Level.INFO);

int totalMarks  = 425;
int numberOfSubjects = 6;
int average = totalMarks/numberOfSubjects;
logger.info("Total Marks: " + totalMarks);
logger.info("Number of Subjects: " + numberOfSubjects);
logger.info("Calculated Average(Incorrect): " + average);*/
Map<String,String> capitals = new HashMap<>();
capitals.put("india","New Delhi");
capitals.put("usa","Washington D.C");
capitals.put("france","paris");

String country = "France";
String capital = capitals.get(country.toLowerCase());
System.out.println("Capital of " + country + ": " + capital);
    }
}
