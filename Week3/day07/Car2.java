
public class Car2 {
     //This is class created for objectorientedprogramming2 this program 
    // A class can behave for listing/creating objects

    // eg: we created an class of Car whih has the following attributes of the car
    // Attributes:
    String make="Ford";
    String model="Mustang";
    int year=2025;
    double price=58000.99;
    boolean isRunning;

    // This class both attributes+Action its a continuation of objectorientedprogramming.java and Car.java Class
    // This calss will be used for objectorientedprogramming2.java program

    // Actions:
    void Start(){
        isRunning=true;
        System.out.println("You start the engine ");
    }

    void Stop(){
        isRunning=false;
        System.out.println("You stop the engine ");
    }

    void Drive(){
        System.out.println("You drive the "+model);
    }

    void brake(){
        System.out.println("You brake the "+model);
    }
}
