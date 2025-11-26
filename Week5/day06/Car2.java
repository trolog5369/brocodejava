
public class Car2 {
    // This is continuation of Car.java and associated with the getterandsetter2.java class

    // Now the datatype is presetted now we cant access these attributes outside of this class
    // If you dont want an attrivute to be writable only readible then use the final keyword in this case model
    // This adds an extra security measure
    private final String model;
    private String colour;
    private int price;
    // But theres a other way around ie getterandsetters

    // constructor
    Car2(String model,String colour,int price){
        this.model=model;
        this.colour=colour;
        this.price=price;
    }

// use GETTER to read and SETTER to write

// GETTER METHOD
//Return type get+attribute name 
    String getmodel(){
        return this.model;
    }
    String getcolour(){
        return this.colour;
    }
    int getprice(){
        return this.price;
    }

// SETTER METHOD we use that to wirte
// we can change the price and colour accordingly
// follow the same pattern as the getter Methods
    void setcolour(String colour){
        this.colour=colour;
    }
    void setprice(int price){
        this.price=price;
    }
}
