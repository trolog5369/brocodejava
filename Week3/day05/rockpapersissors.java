
import java.util.Random;
import java.util.Scanner;
public class rockpapersissors {
    public static void main(String[] args) {
        // Rock paper sissors

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        //Decalare variables
        String [] choices={"rock","paper","sissors"};
        String playerChoice;
        String computerChoice;
        String playAgain="yes";

        do{
         // Get the choice from the user
        System.out.print("Enter your move:(rock,paper,sissors) ");
        playerChoice=scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && 
           !playerChoice.equals("paper") &&
           !playerChoice.equals("sissors")){
            System.out.println("Invalid choice!");
        }

        // get random choice for the computer
        computerChoice=choices[random.nextInt(3)];// returns a random no from 0 to 2
        // 0 is rock 1 is paper and 2 is sissors
        System.out.println("Computer choice: "+computerChoice);

        // check win conditions
        if(playerChoice.equals(computerChoice)){
            System.out.println("Its a tie!");
        }
        // The below are all the win condition 
        // else if(playerChoice.equals("rock") && computerChoice.equals("sissors")){
        //     System.out.println("You win!");
        // }
        // else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
        //     System.out.println("You win!");
        // }
        // else if(playerChoice.equals("sissors") && computerChoice.equals("paper")){
        //     System.out.println("You win!");
        // }

        // we will condense them in one else if
        else if((playerChoice.equals("rock") && computerChoice.equals("sissors"))||
                (playerChoice.equals("paper") && computerChoice.equals("rock"))||
                (playerChoice.equals("sissors") && computerChoice.equals("paper")) ){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");

        }

        // ask to play again?
        System.out.print("Do ypu wanna play again?(yes/no): ");
        playAgain=scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));
       
        // goodbye message
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
