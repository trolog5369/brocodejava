
import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM
        Scanner scanner=new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        double choice;

        // Welcome message
        System.out.println("Weight conversion Program ");
        System.out.println("1:Convert lbs to kgs ");
        System.out.println("2:Convert kgs to lbs ");

        // Prompt for user choice/input
        System.out.println("Choose an option: ");
        choice=scanner.nextInt();

        // option 1 convert lbs to kgs
        if (choice==1) {
            System.out.print("Enter the weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            // System.out.println("The new weight in kgs is: "+newWeight);
            // if we want to limit the decimal use printf
            System.out.printf("The new weight in kgs is : %.2f",newWeight);
            }


        // option 2 convert kgs to lbs
        else if (choice==2) {
            System.out.print("Enter the weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight*2.20462;
            // System.out.println("The new weight in lbs is: "+newWeight);
            // if we want to limit the decimal use printf
            System.out.printf("The new weight in lbs is : %.2f",newWeight);
        }

        // else print not a valid choice
        else {
            System.out.println("That was not a valid choice!");
        }

        scanner.close();

    }
}
