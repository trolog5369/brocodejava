
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class readfiles {
    public static void main(String[] args) {
        // How to read a file using java(3 Popular Options)

        // BufferReader + FileReader:Best for reading text files line-by-line
        // FileInputStream:Best for binary files(eg.,images,audio files)
        // RandomAccessFiles:Best for raed/write specific portions of large fles

        // BufferReader+FileReader:
        // BufferReader act as a middleman between the program and the file system
        // beacuse it can't read a file by itself
        // FileReader is what actually reads the file

        // In this demonstration will do the BufferReader+FileReader

        // We have created a text file named test.txt in the day06/week6 directory and copied it's path
        String filepath="C:\\brocodejava\\Week6\\day06\\test.txt";

        // Now we will be combining the BufferReader and FileReader 
        // BufferedReader reader=new BufferedReader(new FileReader(filepath));
        // We have to pass in the FileReader as the argument to the BUfferReader object

        try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
            String line;//local variable line
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
            // While loop used for printing each line:
            // line use the reader.line method to iterate thr each line and point to the next line
            // until the lines are finished(null) iterate and for each iteration print the line
        }
        // The try {} checks the dangerous code if works then proceed with the o/p

        // These catch{} will run if the path(C:\\brocodejava\\Week6\\day06\\test.txt) is inputted wrong
        catch(FileNotFoundException e){
            System.out.println("Could not locate file!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
    }
}
// try-with-resources automatically closes resources.
// Anything inside the try(...) must implement AutoCloseable/Closeable.
// It closes even if exceptions occur or returns are hit.
// Cleaner than try-finally and safer (no resource leaks, suppressed exceptions preserved).
