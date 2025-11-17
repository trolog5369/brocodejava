
// This is the subclass of Shape.java
public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    // we need to override this method as due to abstarct keyword
    // The child classes need to implement this
    @Override
    double area(){
        return length*width;
    }
}
