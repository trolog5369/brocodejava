import java.util.Scanner;

public class threading {
    public static void main(String[] args) {
        // Thread=Flow of a execution in a program
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
        
        // Let's say it's a game where user should input their name and he has 5sec if he fails he loses
        // currently we are using only 1 Thread ie Main
        Scanner scanner=new Scanner(System.in);

        System.out.println("You have 5 sec to enter your name");

        for(int i=1;i<=5;i++){
            try{
            // To mimmic waiting for 1sec use the Thread class call the sleep method Thread refers to the current thread we're working on ie Main
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }
            // Exit condition
            if (i==5) {
                System.out.println("Time's Up!");
            }
        }
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);


        scanner.close();
    }
}
// You have 5 sec to enter your name
// Time's Up!
// Enter your name: bro
// Hello bro

// This code don't work like the way we think
// The main problem with This program is that The Time's up! loop gets execited first
// Then we get the prompt of Enter your name and then we can type in our name and program exists
// This problem is due to beacuse all of this code is running on The same Thraed 
// We have 5sec to enter our name but we can't reach the prompt (code) until the 5 sec are up
// Beacuse the main Thread is waiting for the Time's Up loop to be finished so we can do is create seprate theread where we can 
// Count to 5 and 2nd Thread is incharge to accepting the user input!

// IMP=once the main (non-daemon) thread finishes, only daemon threads remain, so the JVM exits and terminates them.

// Check threading2.java for continuation