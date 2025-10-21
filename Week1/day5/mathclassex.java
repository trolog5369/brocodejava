
import java.util.Scanner;
public class mathclassex {
    public static void main(String[] args) {
        // find teh hypo of the triangle
        // HYPOTENEUS c=Math.sqrt(a²+b²)
        Scanner scanner=new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A:");
        a=scanner.nextDouble();

        System.out.print("Enter the length of side B:");
        b=scanner.nextDouble();

        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("The hypotenuse (side c) is: "+c+" cm");

      

        scanner.close();
    }
}
