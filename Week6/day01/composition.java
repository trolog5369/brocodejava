
public class composition {
    public static void main(String[] args) {
        // Composition = Reprsents a "part-of" relationship between objects.
        //               For example, An Engine is "part of" a Car.
        //               Allows complex objects to be constructued from smaller objects.

        Car car=new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);
        //This will show us a Engine@7344699f beacuse engine is an object hence it will shows us 
        // a refrence datatype so if we o/p directly will get hash id 

        // To access the engine type use the access modifier and then type the datatype
        System.out.println(car.engine.type);

        car.start();
    }
}
// Engine is a object which is composed in the other dataobject(Car)
// key diffetrence if we delete the Car object then we dont have the access to the engine ie the engine object will also be deleted
// Beacuse it is a "part of" not "is a"