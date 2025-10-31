
import java.util.Random;
import java.util.Scanner;
public class dicerolling {
    public static void main(String[] args) {
        // Dice Roller Program

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        // Declaring variables
        int numofDice;
        int total=0;

        // Number(#) of dice from the user
        System.out.print("Enter the # of dice to roll: ");
        numofDice=scanner.nextInt();
        // check if # is >0
        if (numofDice>0) {

        // roll all the dice
            for (int i = 0; i < numofDice; i++) {
                int roll=random.nextInt(1,7);//gives random no between 1 to 6
                printDie(roll);
                System.out.println("You rolled: "+roll);
                total=total+roll;
            }
        // get the total(sum)
            System.out.println("Total: "+total);
        }
        else{
            System.out.println("# of dice must be greater than 0!");
        }

        // Display the ASCII of Dice (hard part)
        scanner.close();

        
    }   
    static void printDie(int roll){
        // """ """ This is a multi line string and ● got to charmap windows for this
        String dice1="""
                --------
                |      |
                |  ●   |
                |      |
                --------

                """;
        String dice2="""
                ---------
                |●      |
                |       |
                |      ●|
                ---------

                """;
        String dice3="""
                ---------
                |●      |
                |   ●   |
                |      ●|
                ---------

                """;
        String dice4="""
                ---------
                |●     ●|
                |       |
                |●     ●|
                ---------

                """;
        String dice5="""
                ---------
                |●     ●|
                |   ●   |
                |●     ●|
                ---------

                """;
        String dice6="""
                ---------
                |●     ●|
                |●     ●|
                |●     ●|
                ---------

                """;
        
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Inavlid roll");


            
        }
    }
}
