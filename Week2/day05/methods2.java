
public class methods2 {
public static void main(String[] args) {
    // Methods=block of reusable code that is executed when ()
    // we can write a code once and reuse it many times as per we wish we just have to call it

    String name="Bro";
    int age=25;
    // if we were to use these varibales in our happybirthday method
    // the method actually dosent know who they are the var
    happybirthday();

// Important points to remember:(reagrding methods)
// Method are unfamilar with variables declared in other methods!



}
 static void happybirthday(){ 
  System.out.println("Happpy Birthday to you!");
  System.out.printf("Happy Birthday dear %s",name);
  System.out.println("You are x years old");
  System.out.println("Happpy Birthday to you!\n");
}
}

// Output
// methods2.java:21: error: cannot find symbol
//   System.out.printf("Happy Birthday dear %s",name);                                         ^
//   symbol:   variable name
//   location: class methods2
// 1 error

// As java dosnnt know the variables of methods from another method
// one way which we can solve this is by passing an argument to the method
//See method3.java for further!

