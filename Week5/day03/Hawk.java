
// This is a class 
// Use implement keyword for using the interface
public class Hawk implements Predator{
// Public as this is publically accessable method

    // We have to override the methods in the interface as its like a contarct if we using method from iterface we should define them
    // in simple words the methods are abstract hence we gotta override 
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }
}
