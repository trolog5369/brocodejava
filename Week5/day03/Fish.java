
// This is a class 
// Use implement keyword for using the interface
public class Fish implements Prey,Predator{
// Public as this is publically accessable method

    // We have to override the methods in the interface as its like a contarct if we using method from iterface we should define them
    // in simple words the methods are abstract hence we gotta override 

    @Override
    public void flee(){
        System.out.println("The fish is swimming away!");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}
