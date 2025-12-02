

// THIS IS A CONTINUATION OF writefiles2.java will optimize the code more by assigning the strings for better oragnisayion
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;//Gotta import as we are encountering this type of exception
public class writefiles2 {
    public static void main(String[] args) {
        // how to write a file using Java(4 popular options)

        // For better organisation we created a String (filepath,textContent) and pass in the filepath and textcontent
        // To the Writer object hence we optimize and did better organisation of the code
        
        String filepath="C:\\brocodejava\\Week6\\day05\\testabsoultepath.txt";
        String textContent="I like pizza!\n its really good!";
        // We can also write multi line string using """ """; and the we can make it!

        // The below FileWriter the test.txt do have a absoulte file path C:\brocodejava this test file is been created in the path
        try(FileWriter writer=new FileWriter(filepath)){
            writer.write(textContent);
            System.out.println("The file has been written");
        }

        // The below exceptions will run if we mispelled the path ie this path C:\\brocodejava\\test.txt"
        catch(FileNotFoundException e){
            System.out.println("Could not locate the file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
// / (single forward slash intrepts as escape sequence)
// // (double forward slash intreputs as location)