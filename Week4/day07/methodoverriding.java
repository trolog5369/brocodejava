
public class methodoverriding {
    public static void main(String[] args) {
        // Method overriding=When a subclass provides its own 
        //                   implementation of a method that is already defined
        //                   rather than use one that inherited from parent
        //                   Allows for the code reusability and give speciifc implementations 
        Dog dog=new Dog();
        Cat cat=new Cat();
        Fish fish=new Fish();
        // All these should have a move method now

        dog.move();
        cat.move();
        fish.move();
        // This will output before overriding the method
        // This animal is running
        // This animal is running
        // This animal is running

        // But fish swims so the statemnt isn't correct hence we can overridde this method 
        // We will write a new method in the fish class so that we can generate the desired output

        // THERES PRECIDENCE ABOUT THE USAGE OF METHODS 
        // IF YOU HAVE THE SAME NAME OF METHOD DEFINED IN THE CHILD CLASS
        // YOU WILL USE THAT ONE FIRST THATS THE PRECIDENCE INSTEEAD OF PARENT CLASS

// This animal is running
// This animal is running
// This animal is swimming

        // Now the output is desired we have given specific implementaion for the fish class
        // The cat and dog classes will use whats inherited from the parent


    }
}
// 🖼️ UML Diagram (Simple)
//            Animal
//              |
//      -----------------
//      |       |       |
//     Dog     Cat     Fish
//                      |
//                  overrides move()