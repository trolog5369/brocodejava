
import java.util.Scanner;
public class serachanarray5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int size;
        int [] Numbers;
        // Enter the size of the array
        System.out.print("Enter the size of the array: ");
        size=scanner.nextInt();

        // Enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        Numbers=new int[size];

        for (int i = 0; i <size; i++) {
            System.out.print("Elements "+i+": ");
            Numbers[i]=scanner.nextInt();
        }

        int target;
        boolean isFound=false;

        System.out.print("Enter the targeted element: ");
        target=scanner.nextInt();

        for(int i=0;i<Numbers.length;i++){
            if (target == Numbers[i]) {
                System.out.println("Element found at index: "+i);
                isFound=true;
                break;
            }
        }
        if (isFound==false) {
            System.out.println("Element is not present in the array!");
        }
        scanner.close();
    }
}

