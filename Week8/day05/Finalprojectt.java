import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Finalprojectt {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK(Final Poject of the BroCode Java Tut's)

        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        // when a user types in a String of time we will format it and then parse it.
        LocalTime alarmTime=null;
        String filepath="alarmaudio.wav";

        while(alarmTime==null){
        try{
        System.out.print("Enter an Alarm Time(HH:mm:ss): ");
        String inputTime=scanner.nextLine();

        alarmTime=LocalTime.parse(inputTime,formatter);
        System.out.println("Alarm set for "+alarmTime);

        }
        catch(DateTimeParseException e){
            System.out.println("Invalid Format! please use HH:MM:SS");
        }
        }

        // We have sucessfully set an Alarm Time our AlarmTime is a local Time obj

        // We have to create an AlarmTime class to create AlarmTime objects
        Alarmclock alarmclock=new Alarmclock(alarmTime,filepath,scanner);
        Thread alarmThread=new Thread(alarmclock);
        alarmThread.start();
    }
}
