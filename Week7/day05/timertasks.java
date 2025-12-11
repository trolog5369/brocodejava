
import java.util.Timer;
import java.util.TimerTask;

public class timertasks {
    public static void main(String[] args) {
        // Timer=Class that scheudles tasks at specific times or periodically
        //       Useful for:sending notifications,scheduled updates,repetitive actions

        // TimerTask=Represent the task that will be executed by the Timer
        //           You will extend the TimerTask class to define yout task
        //           Create a subclass of TimerTask and @Override run()
        // TimerTask is an abstracted class hence we have to overide the run()

        // We're are doing this by using anonymous classes we learnt in the last session

        // Timer and TimerTask works together
        // We have to overide the run method of the TimerTask to get the expected/desired output


        Timer timer=new Timer();

        TimerTask task=new TimerTask() {//This is an anonymous class

            int count=3;//local varibale to stop the infinite loop of task

            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if (count<=0) {
                    System.out.println("Task complete!");
                    timer.cancel();//method to cancel the task
                }
            }
        };

        // timer.schedule(task, 1000);
        // delay is in miliseconds hence 1000mili sec=1sec

        // We can also scheduled at a fix rate as the Timer can do things periodically
        // timer.schedule(task, 1000,3000);
        // It's like execute the run(){ie print hello(task)} every 0sec after 3sec delay

        // we can also delay it 
        timer.schedule(task, 3000,1000);
        // It's like execute the run(){ie print hello(task)} every 1sec after 3sec delay
    }
}
//  Why Use Anonymous Classes Here?
// TimerTask is abstract → needs a custom run() method.
// We only need this task once.
// Instead of creating a new file like MyTask.java, we override run() directly inside the object creation.
// Perfect scenario for anonymous classes.