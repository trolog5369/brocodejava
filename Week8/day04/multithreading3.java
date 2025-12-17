
public class multithreading3 {
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


            //Game Start!
            // Game over!
            // PING
            // PING
            // PING
            // PING
            // PING
            // The problem is That the main Thread dosen't stop until the Thread0 and Thraed 1 are finised
            // The main Thread ends immediately we can solve this by join() method

            try{
            // join() tells the Main thread that pause until these thereads are finished in short
            thread0.join();
            thread1.join();
            }
            catch(InterruptedException e){
                System.out.println("The Main thread was interrupted!");
            }

        System.out.println("Game over!");

//         Game Start!
//         PONG
//         PING
//         PONG
//         PING
//         PONG
//         PING
//         PONG
//         PING
//         PONG
//         PING
//         Game over!
        // Excpected output!
    }
}
// Multithreading allows multiple independent flows of execution,
//  whose order is unpredictable, and coordination must be explicitly controlled using mechanisms like join().
