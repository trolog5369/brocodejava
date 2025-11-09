
public class Studentlol {
    // This is the continuation for the program Student.java and constructors.java
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // A constructur is just a specialmethod within a class

    // Constructor:
    //we just have to passs the correct set of declared arguments
    // we can pass any arguments"name" but for simplicity were passing the same declared ones
    // we could have also passed String a,int b,double c this too works
    Studentlol(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.isEnrolled=true;//not necessary to pass an argument for this
        // this keyword refer to the object we are ceurrently reffering too!
    }
     // if the class have the any method eg:
    void Study(){
        System.out.println(this.name+" is Studying");
    }
}

