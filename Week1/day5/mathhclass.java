
public class mathhclass {
   public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.E);
    // Math is a class in java and PI and E are methods in that class

    double result;
    result=Math.pow(2, 3);
    // Pow is also a method in the Math class ie 2 to the power3 =8
    // and as we use double hence 8.0
    System.out.println(result);

    result=Math.abs(-5);
   //  abs is also a method in the Math class used for absolute value
    System.out.println(result);

    result=Math.sqrt(9);
   //  sqrt is also a method in the Math class used for squareroot
   System.out.println(result);

   result=Math.round(3.14);
   // round is alsoa  method in the Math class used for rounding of a number
   System.out.println(result);

   result=Math.ceil(3.14);
    // ceil is also a method in the Math class used for rounding of a number thr upper ceiling
   System.out.println(result);

    result=Math.floor(3.14);
    // floor is also a method in the Math class used for rounding of a number thr lower flooring
   System.out.println(result);

   result=Math.max(10, 20);
   // max is also a metho in Math class used for finding max value between given no
   System.out.println(result);

     result=Math.min(10, 20);
   // min is also a metho in Math class used for finding min value between given no
   System.out.println(result);
   }
}
