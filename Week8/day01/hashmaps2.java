import java.util.HashMap;

public class hashmaps2 {
    public static void main(String[] args) {
        // HashMap=A data structure that stores key-values pairs
        //         Keys are unique,but Values can be duplicate
        //         Does not maintain any order,but is memory efficient
        //         HashMap<key,Value>//type parameters

        HashMap<String,Double> map=new HashMap<>();
        // HashMap is a raw type. References to generic type HashMap<K,V> should be parameterized 
        // we got this by looking at the HashMap class so it's have type parameters<K,V> setupped

        // We have created a HashMap and we have tell that we have stores String as a key and Double as a value
        // Key is always unique and value can be duplicate

        // to put  something in a HashMap we use the Put method
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("cocunut", 1.00);

        System.out.println(map);
        // {orange=0.75, banana=0.25, apple=0.5, cocunut=1.0}  //cocunut added!

        // To remove an element use the remove method
        // map.remove("apple");
        // System.out.println(map);
        // {orange=0.75, banana=0.25, cocunut=1.0} //apple is removed!

        // to get the value associated with the key use the get method
        System.out.println(map.get("apple"));
        // give me the value where the key is apple ie 0.5

        // We can also check if the key exists or not in a HashMap by using the containskey method // Returns boolean
        // System.out.println(map.containsKey("banana"));//true
        // System.out.println(map.containsKey("pineapple"));//false as pineapple do not exist in the HashMap

        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found!");
        }

        // We also have the capability to to check to see if a map contains any value by using the containsvalue method it also returns boolean
        System.out.println(map.containsValue(1.00));

        // We can return the size of the map using the size method
        System.out.println(map.size());

        System.out.println(map);//we get an ugly formatting

        // by using an enhance for loop we can get a good neat formatting
        // keySet method returns all the keys in the map
        for(String key:map.keySet()){
            // for every key in the HashMap do Key.set()
            System.out.println(key+" : $"+map.get(key));
        }

    }
}
