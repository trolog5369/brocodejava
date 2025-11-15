
// This is a subclass(child class) of the parent class Animal
public class Fish extends Animal{

    // Unique move method only for the fish class
    //There's methodd in the paent class but we want diff output and still be able to call the move()
    // Hence we will override the method

     // IF YOU HAVE THE SAME NAME OF METHOD DEFINED IN THE CHILD CLASS
    // YOU WILL USE THAT ONE FIRST THATS THE PRECIDENCE INSTEEAD OF PARENT CLASS

    @Override
    // This annotation helps us to tells where's code is overriden
    void move(){
        System.out.println("This animal is swimming");
    }
}
