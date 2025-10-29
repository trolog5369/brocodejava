
public class overloadedmethods2 {
    public static void main(String[] args) {
        // overload methods= Method that share the same name;
                            //  but different parameters
                            // signature=name+parameters

        // No 2 methods can share the same signature but can share the same name

        System.out.println(add(1,2));
        // This works fine for 2 arguments!
        // but what if we pass 3 arguments?

// We could create another method which accepts 3 arguments
// System.out.println(add(1, 2, 3));

// Works fine as the no signature can't be same but the name can be!
// What if we run it now like this like passing 2 arguments in the 2nd 2 argument  var
// Continuation for overloadedmethods2.java
System.out.println(add(1, 2));

    }
    // Method with 2 argu
    static double add(double a, double b){
        return a+b;
    }
    // Method with 2 argu 
      static double add(double a,double b){
        return a+b+c;
    }
    // Method with 3 arguments same signature diff names
    // static double add(double a,double b,double c){
    //     return a+b+c;
    // }
    static double add(double a,double b,double c,double d){
        return a+b+c+d;
    }
}

// : method add(double,double) is already defined in class overloadedmethods2
// This is methodoverloading
