
import java.util.Scanner;
public class mathclassex2 {
    public static void main(String[] args) {
        // Given the radius of circle/sphere will return cir,area,vol
        // circumference=2*Math.PI*radius;
        // area=Math.PI*Math.pow(radius,2);
        // volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        Scanner scanner=new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius=scanner.nextDouble();

        circumference=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius, 2);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);

        System.out.println("The circumference of the circle is: "+circumference+" cm");
        System.out.println("The area of the circle is: "+area+" cm²");
        System.out.println("The volume of the circle is: "+volume+" cm³");
        // for superscript of 3 use numlock(on) alt+0179
        // for superscript of 2 use numlock(on) alt+0178

        // If we only wanna display some decimals the we use printf and %f(place holder) [future topic]
        System.out.printf("The circumference of the circle is: %.1fcm\n",circumference);
        System.out.printf("The area of the circle is: %.1fcm²\n",area);
        System.out.printf("The volume of the circle is: %.1fcm³\n",volume);


        scanner.close();


    }
}
