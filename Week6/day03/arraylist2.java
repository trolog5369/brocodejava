
//This is the continuation if ArrayList.java
// Exercise on ArrayList create an array which accepts user input user will enter all the foods he wants in the list
// we have to print it 
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> foods=new ArrayList<>();

        System.out.print("Enter the number of food you would like?");
        int numOfFood=scanner.nextInt();
        scanner.nextLine();//To clear the input buffer

        for (int i=1;i<=numOfFood;i++){
            System.out.print("Enter food number "+i+":");
            // Local variable userinputfoods for getting the user's foods
            String userinputfood=scanner.nextLine();
            foods.add(userinputfood);
            //Adding the userinputtedfoods into the ArrayList of foods
        }

        System.out.println("The ArrayList is: "+foods);
        scanner.close();
    }
}
