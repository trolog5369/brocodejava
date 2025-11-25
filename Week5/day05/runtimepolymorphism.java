
import java.util.Scanner;
public class runtimepolymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of object.

        // Runtime polymorphism is also known as dynamic polymorphism

        // Animal animal=new Animal();
        // cannot be initialize as this is Abstract class

        //We want the user to pick the animal 
        Scanner scanner=new Scanner(System.in);

        Animal animal;
        // We just declared a Animal object this will help us to declare objects

        System.out.print("Would you like a dog or cat(1=dog,2=cat)" );
        int choice=scanner.nextInt();

        // If the choice is 1 then initiate the animal object to be Dog and then call the speak method
        if (choice==1) {
            animal=new Dog();
            animal.speak();
        }
        // If the choice is 2 then initiate the animal object to be cat and then call the speak method
        else if (choice==2) {
            animal=new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice!");
        }

        // Before running the program we cannot decide whether the user will input cat or dog as the object
        // Hence its runtime polymorphism it means The method that executed is decied after running the program based
        // on actual typr of objects  we created
        
    }
}
