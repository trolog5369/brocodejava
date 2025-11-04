

public class arrays2d2 {
    public static void main(String[] args) {
        // 2d array=An array where each element is an array
        //          Useful for stroing a matrix of data

        // We acan also directly initialize the 2d array like this unlike arrays2d.java

        String [][] groceries={{"apple","orange","banana"},
                               {"potato","onion","carrot"},
                               {"chicken","pork","beef","fish"}};

        for(String[] foods:groceries){
            System.out.println(foods);
        }
        // we get memory adddresses as arrays are a ref datatype
//[Ljava.lang.String;@7ad041f3
// [Ljava.lang.String;@251a69d7
// [Ljava.lang.String;@7344699f
// we get memory addresses beacuse were printing for foods:groceries and groceries is an 2d array
// to ptint the element sin the array we have to use another enhance for loop

        for(String []foods:groceries){
            for(String food:foods){
                System.out.print(food+" ");
            }
            System.out.println();
         }



    }
}