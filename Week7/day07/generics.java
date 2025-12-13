import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        // Generics: A concept where you write a class,interface, or method
        //           that is compatible with different data types
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specify the type) i tcan be anything <Integar>,<Boolean> etc

        // We have already seen generics in ArrayList!
        // ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<Boolean> lol=new ArrayList<>();
        // Integar,Boolean,String etc are type arguments here!

        ArrayList<String> fruits=new ArrayList<>();//we have arraylist that stores now String
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("banana");
        // We set the type argument to be Strings hence the fruit(ArrayList) is compatible with Strings

        // If we set this to be Integar type argument then it can store Integar ie compatible with Integars
        // ArrayList<Integer> number=new ArrayList<>();//we have arraylist that stores now Integars
        // number.add(1);
        // number.add(2);
        // number.add(3);

        // ArrayList data structure can store all sort of datatypes but when we create one we have to specify what we're storing Thats the type argument.
        // It's beacuse within the ArrayList class we have a type parameter setupped <T>

        // Using generics we can write some logic thr we can write diff data types.

    }
}
