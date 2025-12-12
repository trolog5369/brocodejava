import java.util.Timer;
import java.util.TimerTask;

public class countdowntimer {
    public static void main(String[] args) {
        // JAVA COUNT DOWN TIMER

        Timer timer=new Timer();
        TimerTask task=new TimerTask() {//anonymous class

            int count=5;//hardcoded
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
// Check countdowntimer2.java for user input count