import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarmclockbyme {
    public static void main(String[] args) {
        // This is an alarm clock designed by me(Pranav Gaikwad)

        // Will accpet the input from user in The form of LocalDate(HH:mm:ss) in this so format
        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time=null;
        String filepath="uthja.wav";

        while (time==null) {
        try{
        System.out.print("Enter the Time for the alarmTime(HH:mm:ss): ");
        String inputTime=scanner.nextLine();

        // we will parse the input using the formatter and patterof method 
        time = LocalTime.parse(inputTime,formatter);

        // if the input is in the format(HH:mm:ss) we will print Alarmset for the provide time
        System.out.println("Alarm set for "+time);
        }
        catch(DateTimeParseException e){
                System.out.println("Invalid format! please use (HH:mm:ss)");
        }
        // reject any invalid input ie try and catch{}
        }

         // in this we will implement the other features ie
        // will then display live time(count up)
        // ie continouslly display current system time
        // and update it every one second in the same format(HH:mm:ss)

        // until this we have created a Wokring alarmclock diaplay now the trigger condition remains

        // When the current time>=AlarmTime then print alarm message
        // play sound.

        Alarm alarm=new Alarm(time,filepath,scanner);
        Thread alarmThread=new Thread(alarm);
        alarmThread.start();
    }
}
