
import java.util.Random;
import java.util.Scanner;
public class numberguessing {
    public static void main(String[] args) {
        // NUMBER GUESSING GAME

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int guess;
        int attempts=0;
        int randomNumber=random.nextInt(1,11);
        // First number is inclusive while second is exclusive ie 1-11 ->1to10

        System.out.println("Number guessing Game");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("Enter a guess:");
            guess=scanner.nextInt();
            attempts++;

            if (guess<randomNumber) {
                System.out.println("Too low try again");
            }
            else if (guess>randomNumber) {
                System.out.println("Too high try again");
            }
            else{
                System.out.println("CORRECT! The number was "+randomNumber);
                System.out.println("# of attempts: "+attempts);
            }

        }while(guess!=randomNumber);

        scanner.close();

        //What if we wanted it to be 1 to 100 we can improve this program insated of hardcoding like this
    }
}
