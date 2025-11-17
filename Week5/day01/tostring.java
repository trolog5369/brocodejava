
public class tostring {
    public static void main(String[] args) {
        // toString()=Method inherited from the Object class
        //           Used to return a string reprsentation of an object
        //           By default , it returns a hash code as a unique identifier
        //           It can be overridden to provide meaningful details.

        // Object class is a superclass
        // toString method is used to return a String reprsentation of an object if we outputed it directly using sout
        // the default behaviour of toString method is that it returns a hash code ie a unique identifier of the object
        // But it cna be overridden to provide us meaning ful details
        
        Car car=new Car("Ford", "Mustang", 2025,"Red");
        System.out.println(car);
        // Result:
        // Car@251a69d7
        // It return a hashcode a unqiue identifier for that car object 

        // hashing:It uses a unique identifier that uses a objects memory object to calculate a objects hash
        // (Advance topic java) upcoming

        // Woudn't it be cool to print the car object directly instaed of hash code
        // normally we would have to do:

        System.out.println(car.colour+" "+car.year+" "+car.make+" "+car.model);
        // Result
        // Red 2025 Ford Mustang

        // We can print our car class object directly by overriding the toString method
        // We created a new class of Car2 for the overriding method

        Car2 car2=new Car2("Ford", "Mustang", 2025,"Red");
        System.out.println(car2);
        // Now as we overide the public method of toString now instead of a hash code we are printing the car
        // object directly
        // Red 2025 Ford Mustang

    }
}
