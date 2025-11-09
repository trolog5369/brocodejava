
public class constructors2 {
    public static void main(String[] args) {
              // Constructor=A special method to initialzie objects
        //             you can pass arguments to a constructor
        //             and setup initial values
        // Constructors is a specail method in a class
        // by using constructors we can create objects with unique values

    // This is the continuation for the program Student.java and constructors.java

    // now we can pass arguments
    Studentlol student1=new Studentlol("Spongebob",30,3.2);
    Studentlol student2=new Studentlol("Patrick",34,1.5);
    Studentlol student3=new Studentlol("Sandy", 27, 4.0);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled);

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled);

    System.out.println(student3.name);
    System.out.println(student3.age);
    System.out.println(student3.gpa);
    System.out.println(student3.isEnrolled);

    
    //We can also call the method from the Studentlol class
    student1.Study();
    student2.Study();
    student3.Study();
    }

}

// In summary:
// constructors are the special method found within a class to initilize an object
// we can pass arguments to an constructors when you initialize them they are use to setup 
// the initial values when you setup them 
// A  constructor is automatrically called when you create an object but we need a matching set of arguments
// if there's any parameter setupped just like other methods
// Ny using constructors we can create objects with unique values