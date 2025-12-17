
public class multithreading {
    public static void main(String[] args) {
        // MultiThreading = Enables a program to run Multiple Threads concurrently
        //                  (Thread =A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        // Two way to run Thraeds 
        // 1.Extend the Thread Class
        // 2.Implement the Runnable interface

        MyRunnable runnable=new MyRunnable();
        // Thread thread=new Thread(runnable);

        // thread.start();//To get the thread to
        // output
        // 1
        // 2
        // 3
        // 4
        // 5
        // What will happen if we run the same thread at the same time? 

        Thread thread0=new Thread(runnable);
        thread0.start();

        Thread thread1=new Thread(runnable);
        thread1.start();

//         1
//         1
//         2
//         2
//         3
//         3
//         4
//         4
//         5
//         5

        // We have sucessfully multiThreaded
        // These threads runn concurrently we could differentiate these by getting their names
        // To get the name of each Thread use the Thread class call the currentThread() and the method chain The getName()
        // Thread.currentThread().getName()

//         Thread-0 1
//         Thread-1 1
//         Thread-0 2
//         Thread-1 2
//         Thread-1 3
//         Thread-0 3
//         Thread-0 4
//         Thread-1 4
//         Thread-0 5
//         Thread-1 5
        // The order of these Threads are differnt everytime as both The Threads Run indenpendently.

    }
}
// Multithreading allows multiple independent flows of execution,
//  whose order is unpredictable, and coordination must be explicitly controlled using mechanisms like join().