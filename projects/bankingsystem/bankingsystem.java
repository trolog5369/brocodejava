
import java.util.Scanner;
public class bankingsystem {
       static  Scanner scanner=new Scanner(System.in);//Class scope
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM

        // Scanner scanner=new Scanner(System.in);//Local scope 

        // Declaring the variables
        double balance=0;
        boolean isRunnning=true;
        int choice;

    while (isRunnning==true) {
            // Display Menu
        System.out.println("BANKING PROGRAM");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************");


        // Get an process user choice
        System.out.print("Enter Your choice(1-4): ");
        choice=scanner.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance=balance+deposit();
            case 3 -> balance=balance-Withdraw(balance);
            case 4 -> isRunnning=false;
            default -> System.out.println("INVALID CHOICE");
        }
    }
    System.out.println("Thank you have a  the nice day!");

        // showBalance()

        // Deposit()

        // Withdraw()

        // Exit Message
        scanner.close();

    }
    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%.2f \n",balance);
    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount=scanner.nextDouble();
        //scanner isnt recognized yet as its local we cna make a local scanner method or just 
        // get the existing scanner to class scope

        if (amount<0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double Withdraw(double balance){
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount=scanner.nextDouble();

        if (amount>balance) {
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        else if (amount<0) {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
}
