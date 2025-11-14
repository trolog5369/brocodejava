
// Person is a Superclass(parent class)
public class Person {
    String first;
    String last;

    // Constructor
    Person(String first,String last){
        this.first=first;
        this.last=last;
    }

    void showName(){
        System.out.println(this.first+" "+this.last);
    }
}
