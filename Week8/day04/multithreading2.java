
public class multithreading2 {
    public static void main(String[] args) {
        // MultiThreading = Enables a program to run Multiple Threads concurrently
        //                  (Thread =A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        // Two way to run Thraeds 
        // 1.Extend the Thread Class
        // 2.Implement the Runnable interface

        // Let's suppose we are making Thread0 to say PING and Thraed1 to say PONG

        Thread thread0=new Thread(new MyRunnable2("PING"));
        Thread thread1=new Thread(new MyRunnable2("PONG"));

        System.out.println("Game Start!");
        thread0.start();
        thread1.start();

        System.out.println("Game over!");

            //Game Start!
            // Game over!
            // PING
            // PING
            // PING
            // PING
            // PING
            // The problem is That the main Thread dosen't stop until the Thread0 and Thraed 1 are finised
            // The main Thread ends immediately we can solve this by join() method
    }
}
// Multithreading allows multiple independent flows of execution,
//  whose order is unpredictable, and coordination must be explicitly controlled using mechanisms like join().