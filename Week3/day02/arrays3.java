
import java.util.Arrays;
public class arrays3 {
    public static void main(String[] args) {
        // Arrays= a collection of values of the same datatype
        //       =Think of it as a variable that can stoe more than one value

        String [] fruits={"apple","orange","banana","coconut"};

        System.out.println(fruits);
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        // Built in function to get the length of the array
        int numOfFruits=fruits.length;
        System.out.println(numOfFruits);

        //built in function to sort the array
        Arrays.sort(fruits);
        
        //Printing elements of the array using for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");
        }

        // Built in function to fill the array with given value 
        Arrays.fill(fruits, "mangoes");

        System.out.println();
        // Enhance for loop(for each loop)
        // for every fruit in my arrays of fruits do this
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
