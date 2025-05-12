//String Arrays
package Day6;

import java.util.Arrays;

public class Activity3 {
    public static void main(String[] args) {
        //Task 6: Declare and initialize a String[] with 5 names and print each name.
        String[] names = {"Aman","Sunil","Adi","Prerna"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        //Task 7: Count and print how many names start with the letter ‘A’ from the array.
        int count=0;
        for(int i=0;i<names.length;i++){
            if(names[i].charAt(0) == 'A'){
                count++;
            }
        }
        System.out.println("Numbers of name starting with A is: " + count);
    }
}
