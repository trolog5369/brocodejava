
public class Car {
    // Before using private access modifier hence now its publically accesable
    // String model;
    // String colour;
    // int price;

    // The below is from the gettersandsetters.java file
        // Car car=new Car("Charger", "Yellow", 10000);
        // System.out.println(car.colour+" "+car.model+" "+car.price);
        // // Yellow Charger 10000

        // // The attributes(model,colour,price) of the car class are publically accesable so when we change the attributes for eg:
        // car.model="Corverte";
        // System.out.println(car.colour+" "+car.model+" "+car.price);
        // // Yellow Corverte 10000
        // // The outputs gets changed we dont want that if we assigned charger we want it to be throughout
        // // What we could do is when declaering the attributes we can use the 
        // // access modifier private preseetting the datatype in the Car class


    // Now the datatype is presetted now we cant access these attributes outside of this class
    private String model;
    private String colour;
    private int price;

    // constructor
    Car(String model,String colour,int price){
        this.model=model;
        this.colour=colour;
        this.price=price;
    }
}
// if we want to access these attributes outside of the class then we use getter and setter
// check getterandsetter2.java and with class Car2.java