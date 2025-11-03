
public class varargs {
    public static void main(String[] args) {
        // varargs= allow a method to accept a variaing # of arguments they
        //          make methods more flexible,no need for overloaded methods
        //          java will pack the arguments into an array
        //          ....(ellipsis)

        // System.out.println(add(1, 2, 3));
        // for methodoverloading

        // what if instead of creating a methods which basically do the same things
        // we can create one methods that would accept any number of arguments
        System.out.println(add(1,2,3,4,5));
        
    }
        // Overloaded methods:same name but diff parameters
        // for example several add method with diff set of parameters
        // static double add(int a,int b){
        //     return a+b;
        // };
        // static double add(int a,int b,int c){
        //     return a+b+c;
        // };
        // static double add(int a,int b,int c,int d){
        //     return a+b+c+d;
        // };
        // static double add(int a,int b,int c,int d,int e){
        //     return a+b+c+d+e;

        // };
        // static double add(int a,int b,int c,int d,int e,int f){
        //     return a+b+c+d+e+f;

        // };
        // static double add(int a,int b,int c,int d,int e,int f,int g){
        //     return a+b+c+d+e+f+g;
        // };

        // we will create one add method which will accpet varing amounts of arguments
        // int... ellipsis means that java is packing each elements into  an array of the arguments

        static int add(int... numbers/*elllipsis*/){
            // java is stroing the entered elements in the form of array
            int sum=0;

        // enhance loop
            for(int number:numbers ){
                sum=sum+number;
            }
            return sum;
        }
}
