// This is a continuation of hangman.java and will make the project more complex now

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class hangingmangame {
    public static void main(String[] args) {
        // JAVA Hangman Game
        // In this game we guess a word and if its in the txt file then we win its simple

        String filePath="words.txt";
        ArrayList<String> words=new ArrayList<>();

        // reading files is dangerous
        // Try{} with resources
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            //read the word line by line
            while ((line=reader.readLine())!=null) {
                words.add(line.trim());
                //trim() to trim the white spaces from the words
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");  
        }
        // Safety net
        catch(IOException e){
            System.out.println("Something went wrong!");
        }

        // We will choose the words at random
        Random random=new Random();
        String word=words.get(random.nextInt(words.size()));

        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> wordState=new ArrayList<>();
        int wrongGuesses=0;//To check the number of wrong guesses

        // This for loop runs thr each word and prints underscore(_)
        for(int i=0;i<word.length();i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        // After 6 wrong guesses game ends
        while (wrongGuesses<6) {

        System.out.print(getHangmanArt(wrongGuesses));

        // Used enhance for loop as the underscores were looking kinda ugly beacuse of the Arraylist format
        System.out.print("Word: ");
        for(char Character:wordState){
            System.out.print(Character+" ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess=scanner.next().toLowerCase().charAt(0);
        // when the user types in just give me the 0th letter ie 1st letter

        // Loop for determining correcting guess
        if (word.indexOf(guess)>=0) {//returns the index of the first occurrence of guess in word.
            // >= 0 → means the letter exists somewhere in the word.
            System.out.println("Correct guess");

            //if guess correct then will fill in the blank spaces
            for(int i=0;i<word.length();i++) {
                if (word.charAt(i)==guess) {
                    wordState.set(i, guess);
                }
            }

            if (!wordState.contains('_')) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("You win!");
                System.out.println("The word was: "+word);
                break;
            }
        }
        //If guess is wrong output this
        else{
            wrongGuesses++;
            System.out.println("Wrong guess");
        }
        }

        if (wrongGuesses>=6) {
         System.out.print(getHangmanArt(wrongGuesses));
         System.out.println("Game over!");
         System.out.println("The word was: "+word);
        }
        scanner.close();
        
    }
    // ASCII art for hangman
    static String getHangmanArt(int wrongGuesses){

        return switch(wrongGuesses){
            case 0 -> """



                      """;
            case 1 -> """
                       o


                      """; 
            case 2 -> """
                       o
                       |

                      """;
            case 3 -> """
                       o
                      /|

                      """;
            // double \\ as its escape sequence hence we use \\ to print \
            case 4 -> """
                       o
                      /|\\

                      """; 
            case 5 -> """
                       o
                      /|\\
                      /
                      """; 
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;            
            default -> "";
        };
    }
}
