
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class musicplayer {
    public static void main(String[] args) {
        // How to PLAY AUDIO with (.wav, .au , .aiff)

        // String filePath="C:\\brocodejava\\Week6\\day07\\lovemenot.mp3";
        // This line will cause error Audio file is not supported! Bye! 

        String filePath="C:\\brocodejava\\Week6\\day07\\lovemenot.wav";

        // Craeting a file object
        File file=new File(filePath);
        // Accessing files is a dangerous code will use try{} and catch{}

        // WE are using try with resources hnece the objectsa gets closed automatically if an object implements the AutoClosable Interface
        // Here Scanner and AudiStream do but the Clip do not!
        try( Scanner scanner=new Scanner(System.in);AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);){

            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);

            String response="";
            while (!response.equals("Q")) {
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.print("Enter your choice");

                response=scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        // Act as a safety net!

        finally{
            System.out.println("Bye!");
        }
    }
}
// - Play audio (.wav, .au, .aiff) using Java
// - Key classes: File, AudioInputStream, Clip
// - User controls: P=Play, S=Stop, R=Reset, Q=Quit
// - Exception handling:
//     FileNotFoundException → wrong path
//     UnsupportedAudioFileException → unsupported format
//     LineUnavailableException → system cannot access audio
//     IOException → general I/O errors
// - try-with-resources automatically closes Scanner and AudioInputStream
// - finally block executes always for cleanup (prints "Bye!")