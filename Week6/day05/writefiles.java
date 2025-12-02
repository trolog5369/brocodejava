
import java.io.FileNotFoundException;//Gotta import as we are encountering this type of exception
import java.io.FileWriter;
import java.io.IOException;//Gotta import as we are encountering this type of exception
public class writefiles {
    public static void main(String[] args) {
        // how to write a file using Java(4 popular optiions)

        // FileWriter=Good for small or medium-sized text files
        // BufferWriter=Better performance for large amounts of texts
        // PrintWriters=Best for structured data,Like reports or logs
        // FileOutputStream=Best for binary fles(eg.,images,audio files)

        // FileWriter is covered is covered in this course rn

        // FileWriter writer=new FileWriter("test.txt");
        // Reading or writing files can be dangerous hence we put it in try{} and catch{} 


        // The below FileWriter the test.txt do not have a absoulte file path hence it will generate a test.txt in the directory local
        // try(FileWriter writer=new FileWriter("test.txt")){
        //     writer.write("I like pizza!");
        //     System.out.println("The file has been written");
        // }

        // The below FileWriter the test.txt do have a absoulte file path C:\brocodejava this test file is been created in the path
        try(FileWriter writer=new FileWriter("C:\\brocodejava\\Week6\\day05\\testabsoultepath.txt")){
            writer.write("I like pizza!\n its really good!");
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

// To optimize the code more see writefiles2.java for continuation