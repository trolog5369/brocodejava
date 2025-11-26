
public class getterandsetter2 {
    // This is the continuation of getterandsetter.java file
    // This class has its own class Cra2.java
     public static void main(String[] args) {
        // They help protect object data and add riles for accessing or modifying them.
        // GETTERS= Methods that make  a field READIABLE.
        // SETTERS= Methods that make a filed WRITEABLE.

        Car2 car2=new Car2("Charger", "Yellow", 10000);
        // System.out.println(car2.colour+" "+car2.model+" "+car2.price);
        // This will cause error as the attributes are private

        System.out.println(car2.getcolour()+" "+car2.getmodel()+" "+car2.getprice());
        // now wee can read those attributes
        // Yellow Charger 10000  expected output

        // car2.colour="Blue";
        // car2.price=5000;
        // We cant use the attributes as they are private hence we use getters and setters

        car2.setcolour("Blue");
        car2.setprice(5000);
        System.out.println(car2.getcolour()+" "+car2.getmodel()+" "+car2.getprice());
        // Blue Charger 5000   
        // output chnaged altho we're using the private (datatype is presetted) we can still the attributes using the setter 

        // As we didnt declared the setmodel() method hence we cant use it beacuse we never declared it
        // car2.getmodel(); --> error

    // If you dont want an attribute to be writable only readible then use the final keyword in this case model
    // This adds an extra security measure


    }
}
// use GETTER to read and SETTER to write
// We can also apply extra logic in the getter and setter 