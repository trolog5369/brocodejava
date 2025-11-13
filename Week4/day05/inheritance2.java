
public class inheritance2 {
    public static void main(String[] args) {
        // Inheritance=one class Inherits the attributees and methods
        //             from another Class
        //             Child<-Parent-<Grandparent
        // A child will inherit from parent and parent will inherit from grandparent

        // Theres also a concept of multilevel inheritance

        //We created 1 grandparent class anmed organism 1 parent class named Animla and its 2 child classes (Dog,Cat)
        // We used extends keyword followed by parent class name so that child
        //classes can inherit the attributes and methods for the parent classes

        // Craeting objects of the classes
        Dog dog=new Dog();
        Cat cat=new Cat();

        // Attributes and methods of Animal class 
        dog.eat();
        cat.eat();

        //This is very useful if we have like 100 of classes 100 of childrens so that we dont have to paste the code 100oftimes
        // rather than simply just change the parent class and the attributes will be inherited by child

        // Each child class could have their own unique attrivbutes and methods too

        //unique attributes of dog and cat (child) classes
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        //unique methods of dog and cat (child) classes
        dog.speak();
        cat.speak();

        // Grandparent class attributes and methods
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
    }
}

// Family Tree
/*                    oragnism(Parent of Animal and Grandparent of dog and cat)
/*                    Animal( parentclass dog and class)
 *                 Dog    Cat(Child classes of animal)
                     
 */
// What if we created one more child class of the Organsim class which dont have any relation with Animal class
// whatsoever? we can
//Check inheritance3.java
