//Collections:List
package Day15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Activity1 {
    public static void main(String[] args) {
    //Task 1: Create an ArrayList<Integer> and add five numbers.
    //Task 2: Remove the third element from the list and print the updated list.
   // Task 3: Loop through the list using a for-each loop and print each element.
   //Task 4: Sort the list in ascending order and print it.
   //Task 5: Search for a specific number in the list using a loop or contains() method.




    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(4);
    arr.add(2);
    arr.add(7);
    arr.add(8);
    arr.add(5);
    System.out.println(arr + " ");
    //After removing
    arr.remove(3);
    System.out.println(arr);
    //Looping
    for(int numbers:arr){
        System.out.println(numbers);
    }
    //sorting
    Collections.sort(arr);
    System.out.println("Array after sorting: " + arr);
    //Checking element
    System.out.println(arr.contains(5));
    

    }
}
