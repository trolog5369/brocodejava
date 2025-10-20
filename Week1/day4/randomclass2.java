
import java.util.Random;
public class randomclass2 {
    public static void main(String[] args) {
        // Continuation of the program randomclass.java
        Random random=new Random();

        int number;

        // number=random.nextInt();
        // System.out.println(number);
        // This generates a random number but theres a problem 
        // It generates a very big random number -1216099753
        // it ranges from -2billion and +2billion
        // hence to generate a number between two limits we can do this

        number=random.nextInt(1,6);
        System.out.println(number);
        // now we have given an upper and lower limit hence only thr 1,5 random no will be generated
        // origin(lower) is inclusive(included in print) and bound(upper) is exclusive (not included in print)

        // What if we want to genearte 3 random numbers
        // see randomclass3.java lol
    }
    
}

    
