
import java.util.Random;
public class randomclass {
    public static void main(String[] args) {
        Random random=new Random();

        int number;

        number=random.nextInt();
        System.out.println(number);
        // This generates a random number but theres a problem 
        // It generates a very big random number -1216099753
        // it ranges from -2billion and +2billion
        // hence to generate a number between two limits we can do this
        // See the program randomclass2.java
    }
    
}
