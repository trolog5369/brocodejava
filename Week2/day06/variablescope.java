
public class variablescope {
    public static void main(String[] args) {
        // Variable scope= where a variable can be accessed
        // There are 2 levels that we will learn local and class

        // It is ok to declare the same name of varibale if its from diff methods

        // 1 Local:
        // Inside of a method if we declared a varibele it has a local scope

        int x=1;//LOCAL VARIABLE
        // System.out.println(x);
        // x isnt recognised by any other method beside main if we want to
        // we will have to pass it by using arguments

        doSomething();//This method isnt aware of the var in the main method hence result =2

        //For CLASS variable check varianlescope2.java

    }
    static void doSomething(){
        int x=2;//LOCAL VARIABLE
        System.out.println(x);
    }
}
