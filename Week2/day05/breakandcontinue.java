
public class breakandcontinue {
    public static void main(String[] args) {
        //Break = break out of the loop(STOP)
        // continue= skip the current iteration of a loop(SKIP)

        for (int i = 0; i < 10; i++) {

            // if (i==5) {
            //     break;
            // }
            // Now as once we hit 5 we will break out of the loop
            // 0 1 2 3 4  used to break the loop completely

             if (i==5) {
                continue;
            }
            // We skipped the cycle of the iteration when value hits 5!
            // 0 1 2 3 4 6 7 8 9  used to skip a given iteration!
            System.out.print(i+ " ");
        }
    }
}
