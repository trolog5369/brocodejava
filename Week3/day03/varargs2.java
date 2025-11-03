
public class varargs2 {
    public static void main(String[] args) {
        // varargs= allow a method to accept a variaing # of arguments they
        //          make methods more flexible,no need for overloaded methods
        //          java will pack the arguments into an array
        //          ....(ellipsis)

        System.out.println(average(1,2,3,4,5,6,7));
        System.out.println(average());
        // empty array none leemnets passed in result=NaN(not a number)
        // we could change the loop for this cond
      
    }
       
    static double average(double...numbers){
        double sum=0;

        // if empty array  System.out.println(average());
        if(numbers.length==0){
            return 0;
        }
        // enhance for loop
        for(double number:numbers ){
            sum=sum+number;
        }
        return sum/numbers.length;
    }
}
