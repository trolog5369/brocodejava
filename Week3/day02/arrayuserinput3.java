
import java.util.Scanner;
public class arrayuserinput3 {
    public static void main(String[] args) {
        // userinput arrays
        Scanner scanner=new Scanner(System.in);
        // Static size of the array
        // String [] foods=new String[4];

        // user defined size
        String [] foods;
        int size;
        System.out.print("What number of food you want?: ");
        size=scanner.nextInt();

        scanner.nextLine();//to clear the buffer as we're using nextint and nextline simulatneously

        foods=new String[size];

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
