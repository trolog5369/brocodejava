
public class constructors {
    public static void main(String[] args) {
        // Constructor=A special method to initialzie objects
        //             you can pass arguments to a constructor
        //             and setup initial values
        // Constructors is a specail method in a class
        // by using constructors we can create objects with unique values

        Student student1=new Student();
        Student student2=new Student();

        System.out.println(student1.name);
        System.out.println(student2.name);

        // The output will be the same not unique
        // Spongebob
        // Spongebob
    }
}
