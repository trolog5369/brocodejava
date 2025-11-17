
public class Car2 {
    String make;
    String model;
    int year;
    String colour;

    // constructor
    Car2(String make,String model,int year,String colour){
        this.make=make;
        this.model=model;
        this.year=year;
        this.colour=colour;
    }
    @Override
    public String toString(){
        return this.colour+" "+this.year+" "+this.make+" "+this.model;
    }
    // We overridden the publuc method of toString() 
    // Hence we can print the car object directly instead of getting an hashcode
}
