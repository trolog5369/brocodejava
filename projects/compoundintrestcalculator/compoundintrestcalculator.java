
import java.util.Scanner;
public class compoundintrestcalculator {
    public static void main(String[] args) {
        // Compound intrest calculator
        Scanner scanner=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=scanner.nextDouble();

        System.out.print("Enter the rate (in %): ");
        rate=scanner.nextDouble()/100;
        // dividing by 100 beacuse we want in percentage the rate

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded=scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years=scanner.nextInt();

        amount=principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);
        // As  A=P[1+R/N]^NT

        // System.out.println("The amount after "+years+" is:$"+amount);

        // we can manuplate the output by using printf also

        System.out.printf("The amount after %d years is $%.2f ", years, amount);



        scanner.close();
    }
}

