
import java.util.ArrayList;//Dynamic resizable array class
import java.util.Collections;//Framework for sorting elements
public class arraylist {
    public static void main(String[] args) {
        // ArrayList=A resizable array that stores obejcts(Autoboxing)
        //           Arrays are fixed in size,But ArrayList can change
        
        // This is an dynamic array ie it dont have fixed size unlike regular arrays
        // Use <> operator to specify the datatype for the array

        // Add,Remove is an built in method of the ArrayList
        // Add is used for adding the element in the Arraylist
        // Remove is used for removing the element at the given index in ArrayList
        // Set is use for setting the element for the given index
        //Get is used for getting a specific element at the given index
        // Size is used for getting the total size of the ArrayList ie no of elements 

        // ArrayList for integar
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // ArrayList for Double
        ArrayList<Double> list2=new ArrayList<>();
        list2.add(3.14);
        list2.add(1.99);
        list2.add(2.01);
        System.out.println(list2);

        // ArrayList for String
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Cocunut");

        // fruits.remove(0);
        // Now the element at index 0 is removed ie Apple

        // fruits.set(0, "Pineapple");
        // The element at index 0 is set to be Pineapple

        System.out.println(fruits);

        // To get an specific element at a given index use the get method
        System.out.println(fruits.get(0));
        // Return the element at index 0

        // To get the size of the ArralyList use the size method will return total amount of elements in the ArrayList
        System.out.println(fruits.size());

        // To sort an ArrayList we can use the collection Framework 
        Collections.sort(fruits);
        // This will sort the elements in alphabetically order
        System.out.println(fruits);//printing the elements after sorting
    }
}
