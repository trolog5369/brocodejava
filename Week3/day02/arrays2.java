
public class arrays2 {
    public static void main(String[] args) {
        // Arrays= a collection of values of the same datatype
        //       =Think of it as a variable that can stoe more than one value

        String furit="apple";
        System.out.println(furit);
        // This variable only stores one value what if we say it can store multiple values?

        String [] fruits={"apple","orange","banana","coconut"};
        // The value inside the arrays are called as elements
        // This now can store multiple values but the variables should be of same datatypes
        // name of the array should be discriptive of what it contain
        System.out.println(fruits);
        // result
        // [Ljava.lang.String;@7ad041f3
        // It gives us memmory aaddress? beacuse each element is given an index no we should specify that
        System.out.println(fruits[0]);
        // Print array of fruits with index 0 ie apple and so on
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        // WE can manuplate the arrays 
        fruits[0]="pineapple";
        System.out.println(fruits[0]);
        // Now at index 0 apple is replaced by pineapple

        // Built in function to get the length of the array
        int numOfFruits=fruits.length;
        System.out.println(numOfFruits);

    }
}
