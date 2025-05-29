//Multithreading:Creating and running thread
package Day18;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 (extends thread) : Running in "+Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread 2 (implements thread) : Running in " + Thread.currentThread().getName());
    }
}

class MyTask extends Thread{
    private String name;

    public MyTask(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name + " - Count: " + i + " - Thread: " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(name + " was interrupted");
            }
        }
    }
}

public class Activity1 {
    public static void main(String[] args) {
        //Task 1: Create a thread by extending the Thread class. Override run() to print a message.
        //Task 2: Create another thread by implementing Runnable. Start both threads.
        //Task 3: Launch multiple threads and observe the interleaved output

        MyThread thread = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread threads = new Thread(runnable);
        thread.start();
        threads.start();

        MyTask thread1 = new MyTask("Thread-A");
        MyTask thread2 = new MyTask("Thread-B");
        MyTask thread3 = new MyTask("Thread-C");
        
        thread1.start();
        thread2.start();
        thread3.start();
        


    }
}
