// This is a continuation of countdowntimer.java its user input not hardcoded as previous

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdowntimer2 {
    public static void main(String[] args) {
        // JAVA COUNT DOWN TIMER

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter no of seconds to count down from: ");
        int response=scanner.nextInt();


        Timer timer=new Timer();
        TimerTask task=new TimerTask() {//anonymous class

            int count=response;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if (count<0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                    // if we don't cancel the timer then it will go infinitely.
                }

            }
        };

        // timer.schedule(task, 0);//This only outputs 5 

        timer.scheduleAtFixedRate(task, 0, 1000);//(task,delay,period)
        // every 1sec perfoem your assigned taskwith 0 sec delay

    }
}
