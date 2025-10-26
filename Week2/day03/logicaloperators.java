
public class logicaloperators {
    public static void main(String[] args) {
        // Logical operators used the user to check or modify more than on condition

        // &&==AND both condition must be true or code wont gets executed(we can evaluate multiple conditions)
        // ||=OR   any one  condition must be true or code wont gets executed
        // !=NOT  it inverse the statement 

        double temp=35;
        boolean isSunny=false;
        
        // FOR AND OPERATOR 
        // if  both condition are true the code gets executed
        if (temp<=30 && temp>=0) {
            System.out.println("The weather is good!");
        }

         // if all 3 condition are true the code gets executed
          if (temp<=30 && temp>=0 && isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside");
        }
        // FOR NOT OPERATOR
        // !isSunny this inverse its truth vale if true theb=n false and vice versa
        else if (temp<=30 && temp>=0  && ! isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy not sunny outside");
        }
        // FOR OR OPERATOR
        // Atleast one condition must be true
        else if (temp>30||temp<0) {
            System.out.println("The weather is bad!");
        }
    }
}
