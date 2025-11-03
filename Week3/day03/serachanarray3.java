
import java.util.Scanner;
public class serachanarray3 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        String [] fruits={"apple","orange","banana"};
        boolean isFound=false;
        String target;

        System.out.print("Enter a furit to search for: ");
        target=scanner.nextLine();

        // linear search (dsa)
        for (int i = 0; i < fruits.length; i++) {
        //  (target==fruits[i]) are these 2 memory addresses the same? 
        //  we cannot do this as we are comparing both the strings and as strings are 
        //a ref datatypes we will be comparing memory addresses not target elements
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: "+i);
                isFound=true;
                break;//break the loop when element found
            }
        }

        if (!isFound) {
            System.out.println("The element is not found in the array");
        }
        scanner.close();
    }
}

