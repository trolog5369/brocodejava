
import java.util.Scanner;
public class arrayuserinput2 {
    public static void main(String[] args) {
        // userinput arrays
        Scanner scanner=new Scanner(System.in);
        // Static size of the array
        String [] foods=new String[4];

        for(int i=0;i<foods.length;i++){
            System.out.print("Enter a food:");
            foods[i]=scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
