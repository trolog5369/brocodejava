import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Alarmclock implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    Alarmclock(LocalTime alarmTime,String filepath,Scanner scanner){
        this.alarmTime=alarmTime;
        this.filepath=filepath;
        this.scanner=scanner;
    }

    @Override
    public void run(){

        while (!LocalTime.now().isAfter(alarmTime)) {
            try{
            Thread.sleep(1000);

            LocalTime now=LocalTime.now();

            int hours=now.getHour();
            int minutes=now.getMinute();
            int seconds=now.getSecond();

            System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
        }
            catch(InterruptedException e ){
                System.out.println("Thread was Interrupted");
            }
        }
        System.out.println("\n*Alarm Noises*");
        playSound(filepath);
    }
    private void playSound(String filepath){
        File audioFile=new File(filepath);

        try(AudioInputStream audioStream=AudioSystem.getAudioInputStream(audioFile);){
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("press enter to stop the alarm!");
            scanner.nextLine();
            clip.stop();

            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audi file format is not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavaliable!");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
