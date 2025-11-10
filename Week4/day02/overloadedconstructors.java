
public class overloadedconstructors {
    public static void main(String[] args) {
        // Overloaded constructors: Allow a class to have multiple constrcutors
        //                          with different parameter lists.
        //                          Enable objects to be initialized in various ways.

        // same as overladed methods

        User user1=new User("Spongebob");
        User user2=new User("Patrick", "PStar@aol.com");
        User user3=new User("Sandy", "SCheeks@gmil.com", 27);
        User user4=new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
// Overloaded constructors they allow a class to have multiple constructors.
// They just need different paramater list enable objects to initialize in variou ways by passing in varing 
// amout of paramters

// This would be great in situation like creating a objects which have some fields optional