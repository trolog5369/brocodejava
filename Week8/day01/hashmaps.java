import java.util.HashMap;

public class hashmaps {
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

        System.out.println(map);
        // {orange=0.75, banana=0.25, apple=0.5}//we will get key,value pairs

        // What if we try to add 1 more orange(key) ie duplicate keys are we know keys should be unique
        map.put("orange", 100000000.00);
        System.out.println(map);
        // {orange=1.0E8, banana=0.25, apple=0.5} we actually override the previous key ie orange=0.75 to orange=1.0E8

        // HashMap cannot have duplicate keys as it will override the previous key
        // if we put another key value pair within a HashMap when it already exist it will override it 

    }
}
