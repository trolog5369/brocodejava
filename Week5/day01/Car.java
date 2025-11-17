
public class Car {
    String make;
    String model;
    int year;
    String colour;

    // constructor
    Car(String make,String model,int year,String colour){
        this.make=make;
        this.model=model;
        this.year=year;
        this.colour=colour;
    }
}
// This method does not overrides the to String method hence when we output the car object directly we get an hash code
// We have overridden the method in Car2.java