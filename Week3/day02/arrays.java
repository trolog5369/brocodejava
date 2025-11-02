
public class arrays {
    public static void main(String[] args) {
        // Arrays= a collection of values of the same datatype
        //       =Think of it as a variable that can store more than one value

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

        // What if we print an elememnt which does not exist?
        System.out.println(fruits[4]);
        // It throws an exception
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // at arrays.main(arrays.java:26)

    }
}
