
public class statickeyword {
    public static void main(String[] args) {
        // Ststic=Makes a variable or method belong to class 
        //        rather than to any specific object
        //        Commonly used for utility methods or shared resources.

        // We created a friend class for this program
        Friend friend1=new Friend("Spongebob");
        Friend friend2=new Friend("Patrick");
        Friend friend3=new Friend("Squidward");
        Friend friend4=new Friend("Sandy");
        
        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);
        // We have created 2 friend objects but the output
        // Spongebob
        // 1
        // Patrick
        // 1

        System.out.println(friend3.name);
        System.out.println(friend3.numOfFriends);

        System.out.println(friend4.name);
        System.out.println(friend4.numOfFriends);

        // Its 1 for both beacuse each friend object has the number of copy for each of the numOfFriend variable
        // Were incrementing each copy of number fo friends by 1 
        // When we create the object of friend 1 we are incrementing  its attribute of numOfFriends by same thing applies to friend2

        // What if would like to keep track of total amount of friends that we created and store withi one variable
        // We can do it with static modifier
        // just in the Friend class replace this line with
        //   int numOfFriends; 
        // static int numOfFriends; thats all...rather than all objects they now share 1 object rather than copy of it

        System.out.println(Friend.numOfFriend);
        // Rather than calling an object and accessing the attribute we can call the class itslef 
        // as its static now
        //altho the other also works
        System.out.println(friend1.numOfFriend);
        // same output but not a good pratice

        // To call a method from the class type classname.methodname
        Friend.showFriend();

        // Another type wehere we can see static method is math class check statickeyword2.java for this
    }
}
