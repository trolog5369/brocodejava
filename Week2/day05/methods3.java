
public class methods3 {
public static void main(String[] args) {
    // Methods=block of reusable code that is executed when ()
    // we can write a code once and reuse it many times as per we wish we just have to call it

    String name="Pranav";
    int age=19;
    //See method3.java continuation we can oass arguments to the methods ie 
    // sent info from one method to another! these are known as arguments(value/variable)
    happybirthday(name,age);
    // We need a matching set of parameters for both the methods
    // We can have both the parameters name diff or same no worries!
    //NAMES OF THE PARAMTERS CAN BE DIFF FROM THE AGRUGMENTS!!
    // just it should be in order and the datatype should be correct

}
 static void happybirthday(String name,int age){ 
  System.out.println("Happpy Birthday to you!");
  System.out.printf("Happy Birthday dear %s!\n",name);
  System.out.printf("You are %d years old\n",age);
  System.out.println("Happpy Birthday to you!\n");
}
}


