
public class methods {
public static void main(String[] args) {
    // Methods=block of reusable code that is executed when ()
    // we can write a code once and reuse it many times as per we wish we just have to call it

    // for eg: we have to sing a happy birthday song 3 times
    // 1:we can use print statements if we arent using methods

    System.out.println("Not using method: ");
    // 1st time
    System.out.println("Happpy Birthday to you!");
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are x years old");
    System.out.println("Happpy Birthday to you!\n");

    // 2nd time
    System.out.println("Happpy Birthday to you!");
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are x years old");
    System.out.println("Happpy Birthday to you!\n");

    // 3rd time
    System.out.println("Happpy Birthday to you!");
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are x years old");
    System.out.println("Happpy Birthday to you!\n");
    // This is inefficient altho this does work

    // By using method (block of reusable code)
    System.out.println("Now using method: ");

    happybirthday();
    happybirthday();
    happybirthday();



}
// we created a happybirthday method same as the main method and used static as main is a static
// and were using a static 
 static void happybirthday(){ 
  System.out.println("Happpy Birthday to you!");
  System.out.println("Happy Birthday dear you!");
  System.out.println("You are x years old");
  System.out.println("Happpy Birthday to you!\n");
}
}
// Important points to remember:(reagrding methods)
// Method are unfamilar with variables declared in other methods!
