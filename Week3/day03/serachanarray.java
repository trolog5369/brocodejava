
public class serachanarray {
    public static void main(String[] args) {
        int [] numbers={1,9,2,8,3,5,4};
        //let say we are searching for the number 2

        int target=2;
        boolean isFound=false;

        // linear search (dsa)
        for (int i = 0; i < numbers.length; i++) {
            if (target==numbers[i]) {
                System.out.println("Element found at index: "+i);
                isFound=true;
                break;//break the loop when element found
            }
        }
        if (!isFound) {
            System.out.println("The element is not found in the array");
        }
    }
}
