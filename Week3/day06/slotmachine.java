import java.util.Random;
import java.util.Scanner;
public class slotmachine {
    public static void main(String[] args) {
        // Slot Machine

        Scanner scanner=new Scanner(System.in);
        // Declare variables
        int balance=100;
        int bet;
        int payOut;
        String [] row;
        String playAgain;

        // Display welcome message
        System.out.println("**************************");
        System.out.println("Welcome to Java slots:    ");
        System.out.println("Symbols:cherry, Watermelon, Bell, Star, lemon");
        System.out.println("**************************");

        // Play if balance>0
        while(balance>0){
        // Enter bet amount
            System.out.println("Current balance: $"+balance);
            System.out.print("Place your bet amount: ");
            bet=scanner.nextInt();
            scanner.nextLine(); //To cleae input buffer

        //       verify bet>balance
        if(bet>balance){
            System.out.println("Infuccient funds!");
            continue;
        }
        //       verify bet>0
        else if (bet<=0) {
            System.out.println("Bet must be greater than zero!");
            continue;
        }
        else{
        //       Subtract bet from balance
            balance=balance-bet;
        }
        
        System.out.println("Spinning.....");
        row=spinRow();//method for spinning
        printRow(row);
        payOut=getPayOut(row,bet);
        if (payOut>0) {//we won something
            System.out.println("You won $:"+payOut);
            balance=balance+payOut;
        }
        else{//we lost lol
            System.out.println("Sorry you lost this round!");
        }
     // Ask to play again
        System.out.print("Do you want to play again?(Y/N)");
        playAgain=scanner.nextLine().toUpperCase();

        if (!playAgain.equals("Y")) {
            break;
        }

     }
   
        // thanks you message(exit message)
        System.out.println("Game Over! Your final balance is $"+balance);

        scanner.close();
    }
    static String[] spinRow(){
        String [] symbols={"cherry", "Watermelon", "Bell", "Star", "lemon"};
        String[] row=new String[3];
        Random random=new Random();

        // System.out.println(symbols[random.nextInt(0,5)]);
        // System.out.println(symbols[random.nextInt(symbols.length)]);
        // Both works the same

        for(int i=0;i<3;i++){
       row[i]= (symbols[random.nextInt(symbols.length)]); 
        }
        System.out.println(row[0]+row[1]+row[2]);
        return row;
    }
    static void printRow(String [] row){
        System.out.println("**************");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("**************");

    }
    static int getPayOut(String [] row,int bet){

        // Checking what if all symbols match
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                // row[0] as all 3 symbols are same we can take any
                case "cherry" -> bet*3;
                case "Watermelon" ->bet*4;
                case "Bell" ->bet*5;
                case "Star" ->bet*10;
                case "lemon" ->bet*20;
                default -> 0;
            };
        }
        // now checking if only 2 symbols matches 1st and 2nd symbol
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                // row[0] as 2 symbols 0,1place are same we can take any
                case "cherry" -> bet*2;
                case "Watermelon" ->bet*3;
                case "Bell" ->bet*4;
                case "Star" ->bet*5;
                case "lemon" ->bet*10;
                default -> 0;
            };
        }
        // now checking if only 2 symbols matches 2st and 2nd symbol
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                // row[0] as 2 symbols 1,2place are same we can take any
                case "cherry" -> bet*2;
                case "Watermelon" ->bet*3;
                case "Bell" ->bet*4;
                case "Star" ->bet*5;
                case "lemon" ->bet*10;
                default -> 0;
            };
        }
        return 0;
    }
}
