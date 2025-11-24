
public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism="POLY"="MANY"
        //             ="MORPH"="SHAPE"
        //             Objects can identify as other objects
        //             Objects  can be treated as objects of a common superclass.
        // eg: A dog identifies as a dog but can also identify as a animal but it can also identify as a organism and also as an object
        // It can be identify as more than one thing

        Car car=new Car();
        Bike bike=new Bike();
        Boat boat=new Boat();

        // car.go();
        // bike.go();
        // boat.go();
        // You drive the car
        // You ride the bike
        // You sail the boat

        // What if wanna do a race in between bike,car and boat

        // Car[] cars={car,bike,boat};
        // Polymorphism.java:22: error: incompatible types: Bike cannot be converted to Car
        // Polymorphism.java:22: error: incompatible types: Boat cannot be converted to Car
        // BIKE AND BOAT ARE NOT IDENTIFIED AS CAR

        // Bike[] bikes={car,bike,boat};
        // Polymorphism.java:25: error: incompatible types: Car cannot be converted to Bike
        // Polymorphism.java:25: error: incompatible types: Boat cannot be converted to Bike
        // CAR AND BOAT ARE NOT IDENTIFIED AS BIKE

        // Boat[] boats={car,bike,boat};
        // Polymorphism.java:30: error: incompatible types: Car cannot be converted to Boat
        // Polymorphism.java:30: error: incompatible types: Bike cannot be converted to Boat
        // CAR AND BIKE ARE NOT IDENTIFIED AS BOAT

        // What to do? we can declare an arraytype which is common in all the objects
        // Car bike and boat all extends the Vechile class also identifies as a vechiles

        Vechile [] vechiles={car,bike,boat};
        // As they have 1 superclass in common hence its works 

        // What if we wanna print the go method for all the classes
        // For the vechile in array of Vechiles do vechile.go()
        for(Vechile vechile:vechiles){
            vechile.go();
        }

    }
}
// Polymorphism can also be achived thr interface just use "implements" instaed of "extends"