import java.util.Random;
import java.util.Scanner;

public class objectorientedprogramming {
    public static void main(String[] args) {
        // Object=An entity that holds data(Attributes)
        //        and can perform actions(methods)
        //        It is a refrence datatype
        //objects can have things and do things

        // eg: A human is an obejct he has data(attributes) like
        // String name; int age;Double height;double weight;
        // also he can have few methods(actions) like
        // sleep(),eat()

        // As object are ref datatype we store the data of  the object in a location called as heap
        // Class can serve as a bule print for creating objects

        // We are already familar with objects such as :
        // Scanner Scanner=new Scanner(System.in);
        // Random random=new Random();

        // for implementing our car object we can do this
        Car car=new Car();
    // We created an "car" object from the Class Car

    // String make="Ford";
    // String model="Mustang";
    // int year=2025;
    // double price=58000.99;
    // boolean isRunning=false;
    // Car object has the following attributees

    // If we try to print the attributes 
        System.out.println(car);
    // Car@251a69d7
    //It will return an memory address as Objet is an refrence datatype 

    // if we need to acces the following attributes we have to do this the . operator same as String.length etc
    System.out.println(car.model);
    System.out.println(car.make);
    System.out.println(car.year);
    System.out.println(car.price);
    System.out.println(car.isRunning);
 
    }
}

// Not only the Object can have attributes it can also perform actions
// check objectorientedprogramming2.java for this
