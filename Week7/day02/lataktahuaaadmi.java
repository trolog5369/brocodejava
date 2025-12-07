import java.util.ArrayList;
import java.util.Scanner;

public class lataktahuaaadmi {
    public static void main(String[] args) {
        // Hangman game by Pranav 

        String word="lol";
        ArrayList<Character> list=new ArrayList<>();
        int wrongGuesses=0;

        Scanner scanner=new Scanner(System.in);

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
