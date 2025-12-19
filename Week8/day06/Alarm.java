import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Alarm implements Runnable {

    private final LocalTime time;
    private final String filepath;
    private final Scanner scanner;

    // constructor
    Alarm(LocalTime time,String filepath,Scanner scanner){
        this.time=time;
        this.filepath=filepath;
        this.scanner=scanner;
    }

    // We have to override this method
    @Override
    public void run(){
        while (LocalTime.now().isBefore(time)) {
            try{
            Thread.sleep(1000);
            LocalTime now=LocalTime.now();

            int hours=now.getHour();
            int minutes=now.getMinute();
            int seconds=now.getSecond();

            System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
            // \r is used for updating the seconds
            }
            catch(InterruptedException e){
                System.out.println("The thread was interrupted!");
            }
        }
            System.out.println("Alarm Noises!");
            Noise(filepath);
    }
         public void Noise(String filepath){
            File audioFile=new File(filepath);

            try(AudioInputStream audioStream=AudioSystem.getAudioInputStream(audioFile)){
                Clip clip=AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                System.out.println("Press enter to stop the alaarm!");
                scanner.nextLine();
                clip.stop();

                scanner.close();
            }
            catch(UnsupportedAudioFileException e){
                System.out.println("Audio format not supported!");
            }
            catch(LineUnavailableException e){
                System.out.println("Audio is unavliable!");
            }
            catch(IOException e){
                System.out.println("Something went wrong!");
            }
        }
}
