
public class overloadedmethods3 {
    public static void main(String[] args) {
                // overload methods= Method that share the same name;
                            //  but different parameters
                            // signature=name+parameters

        // No 2 methods can share the same signature but can share the same name

        String pizza1=bakePizza("flat bread");
        String pizza2=bakePizza("flat braed", "mozzarella");
        String pizza3=bakePizza("flat braed", "mozzarella","peporani");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

    }
    static String bakePizza(String bread){
        return bread+" pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese+" "+bread+" pizza";
    }
    static String bakePizza(String bread,String cheese,String topping){
        return topping+" "+cheese+" "+bread+" pizza";
    }
    // We have 3 methods with same name but the paramters are different its works no prb
    // if there 2 or more methods with the same name will end up using the method where the parameters match
    

    }

