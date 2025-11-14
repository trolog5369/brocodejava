
// This is a child(subclass) of the Person class
public class Student extends Person{
    // As the student extends the person class it will already have it sattributes 
    // ie First,Last and showname method

    double gpa;

    Student(String first,String last,double gpa){
        // this.first=first;
        // this.last=last;
        // we are not able to assign these 2  attributes of the student within the constructor
        // beacuse student inherits from the person class and since our constructor of parent requires
        // first and last name we have to pass its argu to its parent
        // we use super keyword for this

        // any arguments the parents requires we have to send the parent these argument from the child
        // constructor and how do we do that use super keyword and pass the arguments
        super(first,last);
        // super refers to Parent
    
        this.gpa=gpa;
    }
    void showGPA(){
        System.out.println(this.first+"'s gpa is:"+this.gpa);
    }
}
