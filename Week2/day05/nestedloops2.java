

import java.util.Scanner;
public class nestedloops2 {
    public static void main(String[] args) {
        //Nested loop=A loop inside another loop!
        // used often in matrices or DS&A

        int rows;
        int columns;
        char symbol;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows=scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns=scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol=scanner.next().charAt(0);

        // for loop for the columns
        // for (int i = 0; i <columns; i++) {
        //     System.out.print(symbol);
        // }
        //Enter the number of rows: 2
        // Enter the number of columns: 8
        // Enter the symbol to use: $
        // $$$$$$$$
        // We need to use this for loop as many times as no of rows

        // for loops for rows now
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
            System.out.print(symbol);
            // columns logic (for loop) inner 
        }
        System.out.println();
        }


        scanner.close();

    }
}
