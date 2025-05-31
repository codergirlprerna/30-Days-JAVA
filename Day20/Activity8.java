package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Activity8 {
    static class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        // Lower priority number = higher priority
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + " | Priority: " + priority;
    }
}

    public static void main(String[] args) {
        // Task 36: Write your own logic to reverse a LinkedList without using Collections.reverse().
        //Task 37: Create a Map<String, List<String>> and populate it (e.g., category → products).
       //Task 38: Use a PriorityQueue to simulate a task scheduler by priority.
      //ask 39: Compare performance of ArrayList vs. LinkedList in insertion and deletion tasks.
      //Task 40: Demonstrate HashMap vs. TreeMap with regard to ordering and null keys.
      LinkedList <Integer>list = new LinkedList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);

      System.out.println("Original List: " + list);
      LinkedList<Integer> reversedList = reverseLinkedList(list);

      System.out.println("Reversed List: " + reversedList);

       Map<String,List<String>>categoryMap = new HashMap<>();
        categoryMap.put("fruits",Arrays.asList("apple","banana","mango"));
        categoryMap.put("Vegetables",Arrays.asList( "carrot","spinach","potato"));
        categoryMap.put("Diary",Arrays.asList("curd","milk","butter"));

        for(Map.Entry<String,List<String>> entry:categoryMap.entrySet()){
            System.out.println("Category: " + entry.getKey());
            System.out.println("Products: " + entry.getValue());
            System.out.println("-------------------------------");
        }
          PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks to the queue
        taskQueue.add(new Task("Write report", 1));
        taskQueue.add(new Task("Code review", 2));
        taskQueue.add(new Task("Fix bugs", 1));

        // Processing tasks in order of priority
        System.out.println("=== Task Scheduler ===");
        while (!taskQueue.isEmpty()) {
            Task current = taskQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Processing: " + current);
        }

         System.out.println("==== Task 38 complete ====");
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        long startArrayInsert = System.nanoTime();
        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long endArrayInsert = System.nanoTime();

        long startArrayDelete = System.nanoTime();
        for(int i=0;i<100000;i++){
            arrayList.remove(0);
        }
        long endArrayDelete = System.nanoTime();


        //LinkedList Performance 
        List<Integer> linkedList = new LinkedList<>();
        long StartLinkInsert = System.nanoTime();
        for(int i=0;i<size;i++){
            linkedList.add(i);
        }
        long endLinkedList = System.nanoTime();

        long startLinkDelete = System.nanoTime();
        for(int i=0;i<100000;i++){
            linkedList.remove(0);
        }
        long endLinkDelete = System.nanoTime();

        System.out.println("=== Performance Comparision ===");
        System.out.println("ArrayList insertion time: " + (endArrayInsert-startArrayInsert));
        System.out.println("ArrayList deletion time: " + (endArrayDelete - startArrayDelete));

        System.out.println("LinkedList insertion time: " + (endLinkedList-StartLinkInsert));
        System.out.println("LinkedList deletion time: " + (endLinkDelete - startLinkDelete));

        System.out.println("==== Task 39 complete ====");
         Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Banana", "Yellow");
        hashMap.put("Apple", "Red");
        hashMap.put("Mango", "Orange");
        hashMap.put(null, "No color"); // Allows one null key

        System.out.println("=== HashMap (No Ordering, Allows null) ===");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Banana", "Yellow");
        treeMap.put("Apple", "Red");
        treeMap.put("Mango", "Orange");
        // treeMap.put(null, "No color"); // This will show exception

        System.out.println("\n=== TreeMap (Sorted by keys, No null key) ===");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }




    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> reversed = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            reversed.add(list.get(i));
        }
        return reversed;

       

       
    }
}
