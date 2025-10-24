
public class ternaryoperator {
    public static void main(String[] args) {
        // Ternary operator ?=retrun 1 or 2 value if condition is true

        // variable=(condition) ? ifTrue:ifFlase FORMULA FOR TERNARY OPERATOR
        // its like asking a question
        // simplier version of if else statement alternative of if else

        // EXAMPLE 1 
        int score=55;
        // using if else statements:
    //     if (score>=60) {
    //         System.out.println("PASS");
    //     }
    //     else{
    //         System.out.println("FAIL");
    //     }

    // using ternary operators
    String passOrFail=(score>=60)? "PASS":"FAIL";
    // Its like askinga question this or this just takes less lines of code
    System.out.println(passOrFail);

    // EXAMPLE 2 checking if given number is even or odd
    int number=3;
    // using if else 
    // if (number%2==0) {
    //     System.out.println("EVEN");
    // }
    // else{
    //     System.out.println("ODD");
    // }

    // using ternary operators
    String evenOrOdd=(number%2==0)? "EVEN":"ODD";
    System.out.println(evenOrOdd);
    
    // EXAMPLE 3
    int hours=13;
    // Uisng if else
    // if (hours<12) {
    //     System.out.println("AM");
    // }
    // else{
    //     System.out.println("PM");
    // }

    // Uisng ternary operators
    String timeOfDay=(hours<12)?"AM":"PM";
    System.out.println(timeOfDay);

    // EXAMPLE 4 
    int income=60000;
    // double taxRate;
    // Uisng if else operator
    // if (income>=40000) {
    //     taxRate=0.25;
    // }
    // else{
    //     taxRate=0.15;
    // }
    // System.out.println(taxRate);
    // Uisng ternary operator
    double taxRate=(income>=40000)? 0.25:0.15;
    System.out.println(taxRate);

    
    }
}

