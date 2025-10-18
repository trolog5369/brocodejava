
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        // Calculate the area of rectangle

        double width=0;
        double height=0;
        double area=0;
        // We will change the var accordingly ie by user rn its initialize by 0
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the width: ");
        width=scanner.nextDouble();

        System.out.print("Enter the height: ");
        height=scanner.nextDouble();

        area=width*height;
        System.out.println("The area is "+area+" cm²");
        // for cm² this(super script of 2) use numlock on alt+0178



        scanner.close();
    }
}
