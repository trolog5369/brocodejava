
public class generics2 {
    public static void main(String[] args) {
        // Generics: A concept where you write a class,interface, or method
        //           that is compatible with different data types
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specify the type) i tcan be anything <Integar>,<Boolean> etc

        // We craeted a generic Class of Box
        Box<String> box=new Box<>();

        box.setItem("banana");
        System.out.println(box.getItem());
        //We cannot pass in any other datatype other than Strings as we havent specify them and there's only 1 type argument<String> and 1 type parameter<T>

        // We can have more than 1 type parameter in java by <T,U> <T,U,V.....> and so on
        // We created Class of Product for this 2 type parameters

        Product<String,Double> product1=new Product<>("Apple",0.50);
        System.out.println(product1.getItem()+product1.getprice());

        Product<String, Integer> product2=new Product<String,Integer>("Ticket", 15);
        System.out.println(product2.getItem()+product2.getprice());

    }
}
// Generics means we're writing the logic for a class,interface or method which is compatible with all the datatypes
// Same as we wrote the Product class and Box class
