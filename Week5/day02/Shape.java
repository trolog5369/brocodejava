
// This class is going to be abstract we cannot create any object of this class
// This is the parent(superclass)class of Circle,Triangel,Rectangle
public abstract class Shape {

    // This is an abstract method hence it needs to be inplemented by children classes
    abstract double area();//ABSTRACT
    // As this is the general abstract class we need to override this as per neeed

    void display(){//Concrete method is implemented by parent and inherited by children
        System.out.println("This is a shape");
    }
}
