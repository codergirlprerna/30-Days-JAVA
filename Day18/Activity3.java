package Day18;
class Counter{
    int count=0;

/*public void increment(){
    for(int i=0;i<1000;i++){
        count++;
    }
}*/
public synchronized void increment(){
    for(int i=0;i<1000;i++){
        count++;
    }
}
}

class MyThread extends Thread{
    Counter counter;

    public MyThread (Counter counter){
        this.counter=counter;
    }
    @Override
    public void run(){
        counter.increment();
    }
}


public class Activity3 {
    public static void main(String[] args) {
        //Task 6: Create a shared resource (e.g., a counter) and access it from multiple threads without synchronization. Observe incorrect results.
        //Task 7: Add synchronization to fix the race condition and show correct results.

        Counter sharedCounter = new Counter();
        MyThread t1 = new MyThread(sharedCounter);
        MyThread t2 = new MyThread(sharedCounter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        System.out.println("Final Count with Synchronization: " + sharedCounter.count);
    }
}
