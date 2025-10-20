
public class elseifstatements {
    public static void main(String[] args) {
        // If statements= performs a block of code if its condition is true

        int age = 70;

        if (age >= 18) {
            System.out.println("Youre an adult!!");
        } 
        else if (age>=65) {
            System.out.println("Youre a senior!");
        }
        // The above code both the statements age>=18 and age>=65 are true but as the first one gets 
        // printed hence we gotta position the statements accordingly in the code or will get an enexpected o/p
        else if(age<0){
            System.out.println("You havent been born yet!");
        }
        else if (age==0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }
    }
}
