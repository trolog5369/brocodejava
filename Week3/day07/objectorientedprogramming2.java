
public class objectorientedprogramming2 {
    public static void main(String[] args) {
        // This is comtinuation of objectorientedprogramming.java
        // Will demonstratee the attributes+action in this

        Car1 car1=new Car1();
        Car2 car2=new Car2();
        

        System.out.println(car1.isRunning);

        car2.Start();
        System.out.println(car2.isRunning);

        car2.Stop();
        System.out.println(car2.isRunning);

        car2.Drive();
        car2.brake();

        // If we were to craete another car object 
        // we craeted 2 objects from the Car1 class named A and B 
        Car1 carA=new Car1();
        Car1 carB=new Car1();
        System.out.println(carA.make+" "+carA.model);
        System.out.println(carB.make+" "+carB.model);
        // As the objeect ahs same attributes it outputs the same 
        // Ford Mustang
        // Ford Mustang

        // To need to customize them so that each car is unique 
        // Different cars With same attributes and methods which is lame 
        // Hence we will need constructors
        // By passinga an arguments we can create unique objects!


    }
}



