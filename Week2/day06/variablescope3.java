    
public class variablescope3 {
    static int x=3;//CLASS SCOPE(UNIVERSAL)
    public static void main(String[] args) {
        // Variable scope= where a variable can be accessed
        // There are 2 levels that we will learn local and class

        // It is ok to declare the same name of varibale if its from diff methods
        // Now what if we had a mix of both both local and class variables that share the same name then

        int x=1;//LOCAL VARIABLE
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x=2;//LOCAL VARIABLE
        System.out.println(x);
    }
}

// As you can see there are 3 variables with the same name and diff scope but the result
// 1
// 2
// Java prefers local variables over Class variables
