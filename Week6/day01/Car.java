
public class Car {
    String model;
    int year;
    Engine engine;//engine object

    Car( String model,int year,String engineType){
        this.model=model;
        this.year=year;
        this.engine=new Engine(engineType);//"Part of" relation as the engine is a part of Car
    }
// engineType is same as the String type
    void start(){
        this.engine.start();
        System.out.println("The "+this.model+" is running");
    }
}
// Engine type is ambigious
// Type refers to the engine type