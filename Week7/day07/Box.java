
// <T> means type it's a type Parameter here
public class Box<T>{

    T item;//we dont know the datatype of it.

    // We will set the item T(Which ever datatype the user picks) 
    public void setItem(T item){
        this.item=item;
    }

    // As we're returning (T) ie type given by user hence public T getItem(Method name)
    public T getItem(){
        return this.item;
    }
}
// It's a reusable class as we can store diff types of objects

// Generics means we're writing the logic for a class,interface or method which is compatible with all the datatypes
// Same as we wrote the Product class and Box class