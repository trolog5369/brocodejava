import java.util.Scanner;

public class forloops3 {
    public static void main(String[] args) throws InterruptedException 
    //This expection typically occurs when a thread running the method is
    //  interruptted while it is sleeping,waiting, or otherwise paused in its execution
    {
        //Mini program to simulte a countdown!

        // int start=10;
        // for (int i = start; i >  0; i--) {
        //     System.out.println(i);
        // }
        // System.out.println("HAPPY NEW YEAR!");
        //This code works actually fine!

        //If we wanna make it like slowdown in betweeen then we can use the thread class sleep method
        // This is advance java dont sweat it yet!

    

        int start=10;
        for (int i = start; i >  0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            //now it will take 1000milisec=1sec to print for each iteration
        }
        System.out.println("HAPPY NEW YEAR!");

    }
}
