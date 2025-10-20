
import java.util.Random;

public class randomclass3 {
    public static void main(String[] args) {
        // Continuation of the program randomclass2.java
        Random random = new Random();

        int number1;
        int number2;
        int number3;



        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    // for random doubles
    double doublenumber;
    doublenumber=random.nextDouble();
    System.out.println(doublenumber);

    // for booleans like flipping a coin 
    boolean isHeads;
    isHeads=random.nextBoolean();
    if (isHeads==true) {
    System.out.println("Heads");
    }
    else{
        System.out.println("Tails");
    }

    }
}
