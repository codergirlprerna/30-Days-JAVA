//Linked List
package Day15;

import java.util.LinkedList;

public class Activity2 {
    public static void main(String[] args) {
        //Task 6: Create a LinkedList<String> and add several strings (e.g., fruit names).
        //Task 7: Remove an item and print the list.
        //Task 8: Compare performance or usability (brief comment on when to use ArrayList vs. LinkedList)

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("Litchi");
        //removing element
        fruits.remove(2);
        System.out.println(fruits);
        //comparision
       //* Use ArrayList:

/*When you need fast random access (get() and set()).

When insertions/removals are mostly at the end.

Ideal for read-heavy operations.*/

// *Use LinkedList:

/*When you need frequent insertions/removals at the beginning or middle.

When you are doing queue or stack-like operations.

Not ideal for random access.*/

    }
}
