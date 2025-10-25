
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
    // Simple calculator using enhance switches

    Scanner scanner=new Scanner(System.in);

    double num1;
    double num2;
    char operator;
    double result=0;
    boolean validOperation=true;

    System.out.print("Enter the first number: ");
    num1=scanner.nextDouble();

    System.out.println("Enter an operator(+,-,*,/,^): ");
    operator=scanner.next().charAt(0);
    // This above line will only now capture the first char insated of the whole string if entered by user

    System.out.print("Enter the second number: ");
    num2=scanner.nextDouble();

    // Using enhance switch now
    switch(operator){
        case '+' ->result=num1+num2;
        case '-' ->result=num1-num2;
        case '*' ->result=num1*num2;
        case '^' ->result=Math.pow(num1, num2);
        // case '/' ->result=num1/num2;
        // What if someone divides by 0 it gives "Infinity" as a result if we want to prevent that we can use if else
        case '/' ->{
            if(num2==0){
                System.out.println("Cannot divide by zero!");
                validOperation=false;
                // beacuse we dont wanna continue and display the result as its showing
                // Cannot divide by zero!
                //0.0-_> This result 

            }
            else{
                result=num1/num2;
            }
        }
    default ->{
        System.out.println("Invalid operator!");
        validOperation=false;
    }
}
if(validOperation==true){
    System.out.println(result);
}
    scanner.close();
}
}
