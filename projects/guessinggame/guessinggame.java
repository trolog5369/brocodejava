
import java.util.Random;
import java.util.Scanner;
public class guessinggame {
    public static void main(String[] args) {
        // NUMBER GUESSING GAME

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int guess;
        int attempts=0;
        int min=1;
        int max=100;
        int randomNumber=random.nextInt(min,max+1);
        // Min and Max behaves as the variables min is inclusive and max is exclusive! aas 100 is exclusive 
        //  It is from 1 to 99,Hence we did max+1 ie now its from 1 to 100!

        System.out.println("Number guessing Game");
        System.out.printf("Guess a number between %d-%d\n",min,max);

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

    }
}

