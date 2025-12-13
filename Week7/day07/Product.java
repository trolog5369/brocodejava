
public class Product<T,U> {

    // These are general type
    T item;//it can be anything 
    U price;//Price can be a int,float,double etc

    // We will set the item T(Which ever datatype the user picks) 
    Product(T item, U price){
        this.item=item;
        this.price=price;
    }

    // As we're returning (T) ie type given by user hence public T getItem(Method name)
    public T getItem(){
        return this.item;
    }

    // As we're returning (T) ie type given by user hence public T getPrice(Method name)
    public U getprice(){
        return this.price;
    }
}
// It's a reusable class as we can store diff types of objects

// Generics means we're writing the logic for a class,interface or method which is compatible with all the datatypes
// Same as we wrote the Product class and Box class