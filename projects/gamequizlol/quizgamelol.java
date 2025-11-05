
import java.util.Scanner;
public class quizgamelol {
    public static void main(String[] args) {
        // Java quiz game

        // Questions array[]
        String [] questions={"What is the main function of a router?",
                            "Which part of the computer is considered the brain?",
                            "What year was facebook launched?",
                            "Who is known as the father of computers?",
                            "What was the first programming language?"};

        // Options array [][]
        String [][] options={{"1. Storing files","2. Encrypting data","3. Directing internet traffic","4. Managing password"},//will hold all the options for 1st string
                             {"1. CPU","2. Harddrive","3. RAM","4. GPU"},//2nd string options
                             {"1. 2000","2. 2004","3. 2006","4. 2008"},//3rd string options
                             {"1. Steve Jobs","2. Bill Gates","3. Alan Turning","4. Charles Babbge"},//4th string options
                             {"1. COBOL","2. C","3. Fortan","4. Assembly"}};//5th string options

        // Declare Variables
        int [] answers={3,1,2,4,3};//correct answers options from options 2d array
        int score=0;
        int guess;

        Scanner scanner=new Scanner(System.in);

        // Welcome message
        System.out.println("*******************************");
        System.out.println("Welcome to the java quiz game: ");
        System.out.println("*******************************");

        //  Question(loop)
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

        //     Options
        for(String  option:options[i]){
            System.out.println(option);
        }
        //     get a guess from user
        System.out.print("Enter your guess: ");
        guess=scanner.nextInt();

        //     check the guess 
        if (guess==answers[i]) {
        System.out.println("********");
        System.out.println("Correct!");
        System.out.println("********");
        score++;
        }
        else{
        System.out.println("******");
        System.out.println("Wrong!");
        System.out.println("******");
        }
        }
        // Display final score
        System.out.println("Your final score is :"+score+" out of "+questions.length);

        scanner.close();
    }
}
