
// We use the implamets keyword as it allows to have multiple Inheritance ie multuple parents very pratical in real world applications
public class MyRunnable implements Runnable{
    @Override
    public void run(){
           for(int i=1;i<=10;i++){
            try{
            // To mimmic waiting for 1sec use the Thread class call the sleep method Thread refers to the current thraed we're working on ie Main
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }
            // Exit condition
            if (i==10) {
                System.out.println("Time's Up!");
                System.exit(0);//end the program used for threading3.java when we didn't input anything for 10 sec
                // But this is dangerous as it can close rsc,files and is not a good pratice in real world applications
            }
        }
    }
}
// We overide the run method of the Runnable class and pasted the code we want to be run on the different thread 

// IMP=once the main (non-daemon) thread finishes, only daemon threads remain, so the JVM exits and terminates them.
// JVM Exits when all the nondameon thread are finished beacuse it kills the dameon thread automatically