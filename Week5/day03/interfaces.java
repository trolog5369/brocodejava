
public class interfaces {
    public static void main(String[] args) {
        // Interface= A blueprint for a class that specifies a set of abstract methods
        //            that implementing  classes MUST define
        //            Supports multiple inheritance-like behaviour

        // It is very similar to abstract its like overlap we can use either one
        // thr interface we can achieve multiple interihance like behaviour -KEY DIFFERENCE

        // By defination normally with inheritance  Class can have only one paret 
        // But by using interface it can have many parents like 2,3 or more

        Rabbit rabbit=new Rabbit();
        Hawk hawk=new Hawk();

        rabbit.flee();
        hawk.hunt();
        // The hawk will not have a flee methof and rabbit will not have a hunt method
        //As they arent implementing the respected interfaces
        // This will throw an error
        // hawk.flee();
        // rabbit.hunt();

        //The key difference bewteen the abstract classes and interface is we can implement multiple 
        // interface in the class eg:Fish Class
        Fish fish=new Fish();
        fish.flee();
        fish.hunt();
        // This class implemetes both the predator and prey interfaces

        // A class can inherit more than one interface
        // normally with inheritance we can only have 1 parent but this is a way around that
    }
}
