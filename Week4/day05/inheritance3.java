
public class inheritance3 {
    public static void main(String[] args) {
        // Inheritance=one class Inherits the attributees and methods
        //             from another Class
        //             Child<-Parent-<Grandparent
        // A child will inherit from parent and parent will inherit from grandparent

            // What if we created one more child class of the Organsim class which dont have any relation with Animal class
            // whatsoever? we can
   
            // We created a plant class which is a child class of the organism class

            // Creaating object of the class
            Plant plant=new Plant();

            // methods and attribute inherit from the parent class Oragmism
            System.out.println(plant.isAlive);

            //Unique method and attribute of plant class
            plant.photosyntheisis();
        
            // if we call any a methods which isnt inherited ? obiously it wil thr an error
            // dog.photosyntheisis();
    }
}

// Family Tree
/*                     Organism(Parent class of Plant and animal and grandparent of dog and cat)
(child class of organism)Plant      Animal(Child of Organism and parent clas of dog and class)
 *                                Dog    Cat(Child classes of animal)
                     
 
 The Plant class dont have anything to do with the Animal class*/
