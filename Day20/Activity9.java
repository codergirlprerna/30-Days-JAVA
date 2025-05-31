package Day20;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
class LargeObject {
    private String name;

    LargeObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LargeObject{" + "name='" + name + '\'' + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected");
    }
}
public class Activity9 {
    
    public static void main(String[] args) {
        //Task 41: Use System.gc() and Runtime.getRuntime() to demonstrate garbage collection info.
       //Task 42: Create memory-heavy logic and use heap dump viewer or VisualVM (if available).
       //Task 43: Profile execution time of a method using System.nanoTime() or Instant.now().
      //Task 44: Avoid memory leaks by eliminating unused references and using WeakHashMap.
      //Task 45: Refactor a loop-based program using Streams and measure performance.

        /*Runtime runtime = Runtime.getRuntime();

        System.out.println("=== Memory Info Before GC ===");
        printMemory(runtime);

        // Creating lots of objects to consume memory
        for (int i = 0; i < 100000; i++) {
            String dummy = new String("Dummy " + i);
        }

        // Suggesting JVM to run Garbage Collector
        System.gc(); // OR runtime.gc();

        // Give it a little time to complete GC (optional)
        try {
            Thread.sleep(1000); // 1 second pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print memory info after GC
        System.out.println("\n=== Memory Info After GC ===");
        printMemory(runtime);
    }*/


    /*  private static void printMemory(Runtime runtime) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total Memory : " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory  : " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory  : " + usedMemory / (1024 * 1024) + " MB");*/

        /*System.out.println("=== Task 41 complete ===");
                List<DummyObject> memoryHog = new ArrayList<>();
        int counter = 0;

        try {
            while (true) {
                memoryHog.add(new DummyObject());
                counter++;

                if (counter % 1000 == 0) {
                    System.out.println("Created objects: " + counter);
                    Thread.sleep(100); // Slow down allocation
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred after creating: " + counter + " objects");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /* 
        System.out.println("=== Task 42 complete ===");
        long startNano = System.nanoTime();
        performTask();
        long endNano = System.nanoTime();
        long durationNano = endNano - startNano;
        System.out.println("Execution time using nanoTime: " + durationNano + " ns");

        System.out.println("--------------------------------");

        // Using Instant.now()
        Instant startInstant = Instant.now();
        performTask();
        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        System.out.println("Execution time using Instant: " + duration.toMillis() + " ms");

        System.out.println("=== Task 43 complete ===");
        Map<LargeObject, String> weakMap = new WeakHashMap<>();

        LargeObject obj1 = new LargeObject("Object1");
        LargeObject obj2 = new LargeObject("Object2");

        weakMap.put(obj1, "Value1");
        weakMap.put(obj2, "Value2");

        System.out.println("Before nulling strong reference: " + weakMap);

        // Remove strong reference to obj1
        obj1 = null;

        // Request garbage collection
        System.gc();

        // Wait for GC to complete
        Thread.sleep(2000);

        System.out.println("After GC: " + weakMap);
        
    }*/
    
    }
}
     /*static class DummyObject {
        private int[] bigArray = new int[1000]; // 4 KB per object
    }*/




