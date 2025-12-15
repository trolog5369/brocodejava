// This is a continuation for threading.java
import java.util.Scanner;

public class threading2 {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, network communications, or any background tasks)

        // Any code that is time consuming we can run it on a different Thread so that it dosen't inconvinence with the main program

        // How to create a Thread
        // Option 1. Extend the Thread Class (simplier) -> Limited 
        // Option 2. Implement the Runnable Interface (Better) -> Tends to be better 

        // By extending the Thread class we are limited to a single inheritance but'
        // by implementing the runnable interface it's other way around that!

        // In this demosntration option 2. is used
        
        // Let's say it's a game where user should input their name and he has 10sec if he fails he loses
        // currently we are using only 1 Thread ie Main
        Scanner scanner=new Scanner(System.in);

        System.out.println("You have 10 sec to enter your name");

        // We careted a MyRunnable class and implemented the Runnable class and then we override the run() and pasted the code which we
        // wanted to run on the different Thread

        MyRunnable runnable=new MyRunnable();//Craeted a runnable object
        Thread thread=new Thread(runnable);//initialized Thread and passed in the object 
        thread.start();//Thread start.

        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);


        scanner.close();
    }
}
// Both of these Threads are ran at the same time in the background

// The programm dosen't exist until all Threads are done:
// You have 10 sec to enter your name
// Enter your name: lol
// Hello lol
// Time's Up!

// This thread MyRunnable ran as it was set for 10sec so even if we entered the name before 10sec the program did'nt end

// If your Main thread is done we can end other thraeds we have to set up The Dameon method thread

// IMP=once the main (non-daemon) thread finishes, only daemon threads remain, so the JVM exits and terminates them.

// Check threading3.java