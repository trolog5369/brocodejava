
import java.util.Scanner;
public class praticeasf {
    public static void main(String[] args) {
        // Using while, a do-while, and a logical operator in one snippet
        
        Scanner scanner=new Scanner(System.in);
        int age=0;
        String gender="";

        // While loop loops until user enters valid age!
        while(age<=0) {
            System.out.print("Enter your age: ");
            age=scanner.nextInt();

            if (age<=0) {
                System.out.println("Age must be positive!");
            }

        }
        System.out.println("Hi you're "+age+" years old!");


        do{
            System.out.print("Enter your gender: ");
            gender=scanner.next().toUpperCase();
            
            if (!(gender.equals("M")||gender.equals("F"))) {
                System.out.println("Invalid input! Please enter M or F.");
            }

        }while(!(gender.equals("M")||gender.equals("F")));
        System.out.println("Youre a "+gender);
        // reapeat until its M or F 
        // Used logical operator OR

        if (age>18 && gender.equals("M")) {
            System.out.println("You're an adult Male !");   
        }
        else if (age>18 && gender.equals("F")) {
            System.out.println("You're an adult Female!"); 
        }
        else{
            System.out.println("You're not an adult");
        }


        scanner.close();
    }
}
