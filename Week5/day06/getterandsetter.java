
public class getterandsetter {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS= Methods that make  a field READIABLE.
        // SETTERS= Methods that make a filed WRITEABLE.

        Car car=new Car("Charger", "Yellow", 10000);
        System.out.println(car.colour+" "+car.model+" "+car.price);
        // Yellow Charger 10000

        // The attributes(model,colour,price) of the car class are publically accesable so when we change the attributes for eg:
        car.model="Corverter";
        System.out.println(car.colour+" "+car.model+" "+car.price);
        // Yellow Corverte 10000
        // The outputs gets changed we dont want that if we assigned charger we want it to be throughout
        // What we could do is when declaering the attributes we can use the 
        // access modifier private preseetting the datatype in the Car class

    // The attributes get red(error) as they have been setted the dattatype and attributes to private 
    }
}
// if we want to access these attributes outside of the class then we use getter and setter
// check getterandsetter2.java and with class Car2.java