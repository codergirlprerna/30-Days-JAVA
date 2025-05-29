//Streams and Operations
package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Activity2 {
    public static void main(String[] args) {
        //Task 4: Create a List<Integer> and use stream().filter() to select even numbers.
        //Task 5: Use map() to convert a list of strings to uppercase and collect them to a new list.
        //Task 6: Use stream().count() to count how many numbers are greater than a threshold.
        //Task 7: Sort a list of strings using Collections.sort() with a lambda comparator.
       // Task 8: Chain filter(), map(), and collect() in a stream pipeline




        List<Integer> num = Arrays.asList(10,20,30,40,50,60);
        List<Integer> evenNumbers = num.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        List<String> words = Arrays.asList("apple","mango","banana","cherry");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("UpperCase Words: " + upperCaseWords);

        List<Integer> numbers = Arrays.asList(30,12,67,34,25,40,2,4);
        int threshold=20;
        System.out.println("Count calculation starting...");

        long count = numbers.stream().filter(n->n>threshold).count();
        System.out.println("Number greator than " + threshold + ": " + count);

        List<String> names = new ArrayList<>();
        names.add("Banana");
        names.add("apple");
        names.add("Cherry");
        names.add("mango");
        System.out.println("Before sorting: " + names);
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("After sorting (case-insensitive): " + names);


        List<String> fruits = Arrays.asList("apple","mango","banana","cherry","apricot");
        List<String> result = fruits.stream().filter(fruit->fruit.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Filtered and uppercase fruits: " + result);





    }
}
