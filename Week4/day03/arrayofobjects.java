
public class arrayofobjects {
    public static void main(String[] args) {
        Car car1=new Car("Mustang", "Red");
        Car car2=new Car("Corvete", "Blue");
        Car car3=new Car("Charger", "Yellow");

        // We have the 3 car objects
        // We can craete an array
        Car[] cars={car1,car2,car3};
        // We created an car array in which we put our 3 objects

        // iterate thr each iteration
        for(int i=0;i<cars.length;i++){
            cars[i].drive();
            //call the drive() method from the Car class
        }

        // by using enhance for loop
        //for every Car object in the array of cars do car.drive()
        for(Car car:cars){
            car.drive();
        }
    }
}
// We can also ananomoulsy pass the values for the obejcts
// Check arrayofobjects2.java