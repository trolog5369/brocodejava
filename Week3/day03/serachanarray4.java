
import java.util.Scanner;
public class serachanarray4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] Numbers={1,2,3,4,5,6,7,8,9,10};
        int target;
        boolean isFound=false;

        System.out.println("Enter the targeted element: ");
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
    }
}
