
public class overloadedmethods {
    public static void main(String[] args) {
        // overload methods= Method that share the same name;
                            //  but different parameters
                            // signature=name+parameters

        // No 2 methods can share the same signature but can share the same name
        

        System.out.println(add(1,2));
        // This works fine for 2 arguments!
        // but what if we pass 3 arguments in the same method?

        // System.out.println(add(1,2,3));
//         overloadedmethods.java:14: error: method add in class overloadedmethods cannot be applied to given types;
//         System.out.println(add(1,2,3));
//                            ^
//   required: double,double
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error

// We could create another method which accepts 3 arguments
System.out.println(add(1, 2, 3));

// Works fine as the no signature can't be same but the name can be!

// What if we run it now like this like making 2 methods with same signature and same name?
// See program overloadedmethods2.java 

    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
}
