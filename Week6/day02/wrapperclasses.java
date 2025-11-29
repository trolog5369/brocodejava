
public class wrapperclasses {
    public static void main(String[] args) {
        // Wrapper classes= Allow primitive values(int,char,boolean,double)
        //                  to be used(treated) as objects."Wrap them in an object".
        //                  Generally, dont't wrap primitive unless you need an object.
        //                  Allows use of collection Framework and static Utility Methods.

        // Autoboxing=morden metjod used for wrapper classes creation

        // int a=123;
        // We can treat this primitive as an object using the wrapper class
        // Thr this

        // Rather than declaring the variable of int we can use the wrapper classes such as
        // Integar,Double,character,Boolean are wrapper classes
        // Visulization of wrapper classes
        // pass in the datatype as an argument in the wrapper classes

        // Integar a=new Integar(123);
        // Double b=new Double(3.14);
        // Character c=new Character('$');
        // Boolean d=new Boolean(true);

        // Autoboxing :Mordern way to assign classes ie wrapping the objects
        Integer a =123;
        Double b=3.14;
        Character c='$';
        Boolean d=true;
        // These are refrence Datatypes
        // We are wrappping the the primitive values into objects thr wrapper classes


        // Unboxing
        int x=a;
        double y=b;
        char i=c;
        boolean j=d;
        // The datatype should be same as the the wrapper class
        // We're taking the primitive and just unboxing using the same datatype ie setting it back to primitive

        // These wrappers classes have many utility methods which are very useful.
        // check wrapperclasses2.java for continuation
    }
}
/*Autoboxing:Wrapping up the christams present
Unboxing: Unwrapping a christmas present */