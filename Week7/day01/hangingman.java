
import java.util.ArrayList;
import java.util.Scanner;
public class hangingman {
    public static void main(String[] args) {
        // JAVA Hangman Game
        // In this game we guess a word and if its in the txt file then we win its simple
        String word="pizza";

        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> wordState=new ArrayList<>();
        int wrongGuesses=0;//To check the number of wromg guesses

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
        if (word.indexOf(guess)>=0) {
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
// To make this project more enhanced we are going to add features like txt see hangman2.java for the continuation