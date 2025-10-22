
public class nestedifstatements {
    public static void main(String[] args) {
        boolean isStudent=false;
        boolean isSenior;
        double price=9.99;

        if(isStudent){
            System.out.println("You get a student discount of 10%");
            // price=price*0.9;
            price*=0.9; //Shortcut
        }
        else{
            // price=price*1;
            price*=1; //Shortcut
        }
        System.out.printf("The price of a ticket is: $%.2f",price);
    }
}
// This is a reguar if else code but what if someone is senior as well as student then we use nested if like 
// see program nestedifstatements2.java