//List Utilities
package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Activity3 {
    public static void main(String[] args) {
        //Task 9: Convert an array of strings to a List using Arrays.asList().
        //Task 10: Use List.contains() to check if an element exists.
        //Task 11: Clone an ArrayList using clone() or a copy constructor and modify the new list.
        //Task 12: Use ListIterator to iterate through a list in reverse order.

        String[] fruits = {"apple","mango","banana"};
        List <String> fruit = Arrays.asList(fruits);
        
        boolean hasApple = fruit.contains("apple");

        System.out.println("List: " + fruit);
        System.out.println("Contains 'apple'? " + hasApple);


        //cloning
        ArrayList<String> original = new ArrayList<>();
        original.add("java");
        original.add("pyhton");
        original.add("C++");

        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) original.clone();
        clonedList.add("javascript");

        System.out.println("Original List: " + original);
        System.out.println("Clonned List: " + clonedList);

          ListIterator<String> iterator = original.listIterator(original.size());

        System.out.println("Reverse order iteration:");
        while (iterator.hasPrevious()) {
            String lang = iterator.previous();
            System.out.println(lang);
        }
    }
}
