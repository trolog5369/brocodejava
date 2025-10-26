
import java.util.Scanner;
public class dowhile2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=0;

        //WHILE LOOP
        // while (number<1||number>10) {
        //     System.out.print("Enter a number between 1 to 10: ");
        //     number=scanner.nextInt();
        // }
        // System.out.print("You picked "+number);

        // DO WHILE LOOP
         do {
            System.out.print("Enter a number between 1 to 10: ");
            number=scanner.nextInt();
        }while (number<1||number>10);
        System.out.print("You picked "+number);
        // This would work similarly

        scanner.close();
    }
}
