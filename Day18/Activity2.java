package Day18;
class MyTask extends Thread {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " - Started");
        try {
            System.out.println(name + " - Pausing for 2 seconds...");
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }

        System.out.println(name + " - Resumed after 2 seconds");
    }
}

public class Activity2 {
    public static void main(String[] args) {
        //Task 4: Use Thread.sleep() to pause a thread for 2 seconds.
        //Task 5: Use join() to ensure one thread completes before another starts
        MyTask thread1 = new MyTask("Thread-A");
        MyTask thread2 = new MyTask("Thread-B");
        MyTask thread3 = new MyTask("Thread-C");
        
        thread1.start();
        
        try{
            thread1.join();
        }catch(InterruptedException e){
            System.out.println("Main thread corrupted");
        }
        thread2.start();
        

    }
}
