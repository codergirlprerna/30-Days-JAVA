//Collections:Set and Map
package Day16;

import java.util.HashSet;
import java.util.TreeSet;

public class Activity1 {
    public static void main(String[] args) {
        //Task 1: Create a HashSet<String> and add duplicate values. Print the set to show uniqueness
        //Task 2: Create a TreeSet<Integer>, add numbers in random order, and print the set to show automatic sorting.

        HashSet<String> num = new HashSet<>();
       num.add("A");
       num.add("B");
       num.add("C");
       num.add("B");
       num.add("A");
       System.out.println(num);

       TreeSet<Integer> ran = new TreeSet<>();
       ran.add(5);
       ran.add(2);
       ran.add(3);
       ran.add(2);
       ran.add(3);

       System.out.println(ran);
    }
}
