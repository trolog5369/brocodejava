
public class Friend {

    int numOfFriends;//without using static
    static int numOfFriend;//with static
    // This attribute now share the same variable but rather than one object having ownership of the variable 
    // THE FRIEND CLASS OWNS ITAND ALL OBJECTS  HAVE ACCESS TO IT

    String name;

    Friend(String name){
        this.name=name;
        numOfFriends++;//this is not a static variable
        numOfFriend++;//this is  a static variable
    }

    // Methods can also be modifed using the static keyword
    static void showFriend(){
        // System.out.println("You have "+this.name);
        // if we are working with a static attribute we dont need this keyword 
        System.out.println("You have "+ numOfFriend+ " Total friends");
    }
}
