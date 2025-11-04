

public class arrays2d {
    public static void main(String[] args) {
        // 2d array=An array where each element is an array
        //          Useful for stroing a matrix of data

        String [] fruits={"apple","orange","banana"};
        String [] vegetables={"potato","onion","carrot"};
        String [] meats={"chicken","pork","beef","fish"};
        // The above are all seperate 1d arrays
        // what if we can say we can make an arrays of an arrays
        // where each element is an array

        String [][] groceries={fruits,vegetables,meats};

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