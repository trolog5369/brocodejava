    
public class variablescope2 {
    static int x=3;//CLASS SCOPE(UNIVERSAL)
    // Class variable are declared inside a class and they are recognized throughout the class
    public static void main(String[] args) {
        // Variable scope= where a variable can be accessed
        // There are 2 levels that we will learn local and class

        // It is ok to declare the same name of varibale if its from diff methods
        doSomething();
        System.out.println(x);

        // Each method is a house and they cant see whats going on in another house (look in each other house)
        // and Class is outside both the house can see whats going outside ie class has universal scope

        // Now what if we had a mix of both both local and class variables that share the same name then
        // check variablescope3.java
    }
    static void doSomething(){
        System.out.println(x);
    }
}

