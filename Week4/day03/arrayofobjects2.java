
public class arrayofobjects2 {
    public static void main(String[] args) {

// We can also ananomoulsy pass the values for the obejcts
//  This is the continuation of arrayofobjects.java 


        // Car [] cars={{car1,car2,car3};
        Car [] cars={new Car("Mustang", "red"),
                    new Car("Corvete", "blue"),
                    new Car("Charger", "Yellow")};
        // Constructing a new object without giving the object an new identifier like car1,car2,car3 
        // These are known as anaonomous objects

        //for every Car object in the array of cars do car.drive()
        for(Car car:cars){
            car.drive();
        }

        // We can also change the colour of the car also diff attributes lol
        for(Car car:cars){
            car.colour="black";
        }

        // Printing after changing the colour of car
        for(Car car:cars){
            car.drive();
        }
    }
}
