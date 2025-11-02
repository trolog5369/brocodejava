
public class arrayuserinput {
    public static void main(String[] args) {
        String [] foods1={"Pizza","Taco","Hamburger"};
        // The size of this array is 3 elements and you normally
        //  cannot change the size of this array
        System.out.println(foods1.length);

        String [] foods2={};//empty array
        System.out.println(foods2.length);
        // WE cannot assign any values in this arrays 
        // foods2[0]="Pizza";
        // System.out.println(foods2.length);
        // .ArrayIndexOutOfBoundsException: it throws this execption even if its empty
        // brefore assigning values we need to specify the size of the array even if its empty

        String [] foods3=new String[3];
        // We have created a empty array which has now space for 3 elements
        foods3[0]="Taco";
        foods3[1]="hamburger";
        foods3[2]="hotdog";

        for(String food3: foods3){
            System.out.println(food3);
        }

    }
}
