
public class nestedloops {
    public static void main(String[] args) {
        //Nested loop=A loop inside another loop! any kind of loop inside a loop is nested loop
        // used often in matrices or DS&A

        for (int i = 1; i <=9; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        // what if we wanna do this 3 times like print no thr 1to9 3 times?
        // We can copy paste this code 3 times

        for (int i = 1; i <=9; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
         for (int i = 1; i <=9; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
         for (int i = 1; i <=9; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // But we are repeating the same code again and again in programming its not agood pratice!
        // Instead we can create a for loop inside the for loop!

        System.out.println("Now nested loops begins:");//for separating the nested loops
      
        for (int i = 1; i <=3; i++) {
            //if we are declaring a loop inside a loop then we can't decalre the same index 
            // ie no int i for both the loops 
              for (int j = 1; j <= 9; j++) {
                System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}

// Nested loop sare preety good when dealing with matrices! and alsp DS&A