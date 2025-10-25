

import java.util.Scanner;
public class SmartCalculator {
    public static void main(String[] args) {
        
        //“Smart Calculator” 
        //Takes two numbers and an operator like before.
        //Adds a temperature conversion mode (T) that switches to temperature mode. 
        //Adds an enhanced switch menu to pick between calculator and converter.
        //Uses ternary for a sub-decision (e.g., temperature C/F choice).

        Scanner scanner=new Scanner(System.in);

        int choice;
        // Declaring the varibales of the menu
        // For temperature calculator
        double temp;
        double newTemp;
        String unit;

        // For simple Calculator
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOpeartion=true;

        System.out.print("Heyy!! welcome to the smart calculator: ");
        System.out.print("Choose an option(1/2): ");
        System.out.print("1 for temp, 2 for cal, 3 for quit:");
        choice=scanner.nextInt();

        if(choice==1){

        // For temp calculator
        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.println("Convert to Celcius or farahenit(C or F): ");
        unit=scanner.next().toUpperCase();

        newTemp=(unit.equals("C"))? (temp-32)*5/9:(temp*9/5)+32;
        System.out.printf("Converted Temperature: %.1f°%s",newTemp,unit);
        }
        else if(choice==2){

        // For simple calculator

        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();

        System.out.print("Enter the operator(+,-,*,/,^): ");
        operator=scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        switch(operator){
            case '+' ->result=num1+num2;
            case '-' ->result=num1-num2;
            case '*' ->result=num1*num2;
            case '^' ->result=Math.pow(num1, num2);
            case '/' ->{
            if (num2==0) {
                System.out.println("Cannot divide by zero!!");
                validOpeartion=false;
            }
            else{
                result=num1/num2;
            }
        }
            default ->{
                System.out.println("Invalid opertor!!");
                validOpeartion=false;   
        }   
    }
        if (validOpeartion) {
        System.out.println("Result: "+result);
        }
    }
    else if(choice==3){
        System.out.println("Thanks for using the smart cal!");
    }
    else{
        System.out.println("Invalid choice! Please select 1, 2, or 3.");
       // Invalid input handling

    }
        scanner.close();
    }
}
