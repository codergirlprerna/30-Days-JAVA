package Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedBuffer{
    private int data;
    private boolean hasData = false;

public synchronized void produce(int value) throws InterruptedException{
    while(hasData){
        wait();
    }
        data=value;
        hasData=true;
        System.out.println("Produced: " + value);
        notify();
    }
public synchronized int consume() throws InterruptedException{
    while(!hasData){
        wait();
    }
    hasData=false;
    System.out.println("Consumed: " + data);
    notify();
    return data;
}
}

class Producer extends Thread{
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        int value=0;
        try{
            while(true){
                buffer.produce(value++);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread{
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}


public class Activity4 {
    public static void main(String[] args) {
        //Task 8: Implement a simple producer-consumer pattern using wait() and notify() or thread-safe collections like BlockingQueue.

        //Task 9: Use Collections.synchronizedList() or ConcurrentHashMap to manage shared data safely.
       // Task 10: Use ExecutorService to create a thread pool and execute multiple tasks in parallel
      /*  SharedBuffer buffer = new SharedBuffer();
       new Producer(buffer).start();
       new Consumer(buffer).start();*/

       /*List<Integer> list = Collections.synchronizedList(new ArrayList<>());
       Runnable writer = () -> {
        for(int i=0;i<5;i++){
            list.add(i);
            System.out.println("Added: " + i + " by " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
        }
       };
       Runnable reader = () -> {
        synchronized(list){
            for(int value : list){
                System.out.println("Read: " + value + " by " + Thread.currentThread().getName());
            }
        }
       };
       Thread t1 = new Thread(writer,"Writer-1");
       Thread t2 = new Thread(writer,"writer-2");
       Thread t3 = new Thread(reader,"Reader");

       t1.start();
       t2.start();
       try{ t1.join(); t2.join();} catch (InterruptedException e){}
       t3.start();*/

       ExecutorService executor = Executors.newFixedThreadPool(3);
       for(int i=0;i<5;i++){
        int taskNumber = i;
        executor.submit(()->{
            System.out.println("Task " + taskNumber + " is running on thread " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Task " + taskNumber + " completed.");
        });
       }
       executor.shutdown();
    }
}
