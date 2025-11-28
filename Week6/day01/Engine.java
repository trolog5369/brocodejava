
public class Engine {
    String type;

    Engine(String type){
        this.type=type;
    }
    
    void start(){
        System.out.println("You start the "+this.type+" engine");
    }
}
// Engine type is ambigious in the Car class
// Type refers to the engine type