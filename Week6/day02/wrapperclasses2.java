
public class wrapperclasses2 {
    public static void main(String[] args) {
        // Wrapper classes= Allow primitive values(int,char,boolean,double)
        //                  to be used(treated) as objects."Wrap them in an object".
        //                  Generally, dont't wrap primitive unless you need an object.
        //                  Allows use of collection Framework and static Utility Methods.

        // This is the continuation of wrapperclasses.java

        // Wrapper classes utility functions
        // 1.PRIMITIVE DATATYPES INTO STRINGS
        String a=Integer.toString(123);
        String b=Double.toString(3.14);
        String c=Character.toString('@');
        String d=Boolean.toString(false);

        //concantinating all the strings
        String x=a+b+c+d;

        System.out.println(x);

        // String to primitve datatype(inverse of The above stattement)
        // Parsing
        // int e=Integer.parseInt("123");
        // double f=Double.parseDouble("3.14");
        // char g="Pizza".charAt(0);//Dont have a parseChar method totally unrelated to wrapper class hence used String method
        // boolean h=Boolean.parseBoolean("true");

        // String y=e+f+g+h;
        // System.out.println(y);
        // This will not work as were mixing diff datatypes

        // 2.isLETTER METHOD AND isUPPERCASE METHOD
        char letter='b';
        System.out.println(Character.isLetter(letter));
        // Returns a boolean value and isLetter method of Wrapper class Character is used to verify userinput
        System.out.println(Character.isUpperCase(letter));
        // Returns a boolean value and isUppercase method of Wrapper class Character is used to verify userinput


    }
}
/*Autoboxing:Wrapping up the christams present
Unboxing: Unwrapping a christmas present */