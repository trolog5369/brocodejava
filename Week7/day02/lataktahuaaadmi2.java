import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lataktahuaaadmi2 {
    public static void main(String[] args) {
        // Hangman game by Pranav 

        String filePath="hehe.txt";
        ArrayList<String> words=new ArrayList<>();

        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line=reader.readLine())!=null) {
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch(IOException e){//safety net
            System.out.println("Something went wrong!");
        }

        Random random=new Random();
        String word=words.get(random.nextInt(words.size()));

        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> list=new ArrayList<>();
        int wrongGuesses=0;


        System.out.println("****************************");
        System.out.println("Welcome to HangMan game Java");
        System.out.println("****************************");


        // Looping thr each and made the _
        for(int i=0;i<word.length();i++){
            list.add('_');
        }

        while (wrongGuesses<7) {
            System.out.println(AsciiArt(wrongGuesses));

        // Fixed the _ as it was looking ugly
        for(Character c:list){
            System.out.print(c+" ");
        }
        System.out.println();
            System.out.print("Guess a letter: ");
            char guess=scanner.nextLine().toLowerCase().charAt(0);

            if (word.indexOf(guess)>=0) {
                System.out.println("Correct guess!");
                for(int i=0;i<word.length();i++){
                if (word.charAt(i)==guess) {
                 list.set(i, guess);
                }
            }
            }
             else{
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }

            if (!list.contains('_')) {
                System.out.println(AsciiArt(wrongGuesses));
                System.out.println("You win!");
                System.out.println("The word was: "+word);
                break;
            } 
        }

        if (wrongGuesses>=7) {
            System.out.println("You lose!");
            System.out.println("The word was: "+word);
        }
        scanner.close();
    }
    static String AsciiArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 ->"""



                     """;
            case 1 ->"""
                      o


                     """;
            case 2 ->"""
                      o
                      |

                     """; 
            case 3 ->"""
                      o
                     /|

                     """;
            case 4 ->"""
                      o
                     /|\\

                     """; 
            case 5 ->"""
                      o
                     /|\\

                     """; 
            case 6 ->"""
                      o
                     /|\\
                     /
                     """;
            case 7 ->"""
                      o
                     /|\\
                     / \\
                     """;
            default -> "";//just in case                                    
        };
    }
}
