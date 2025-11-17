
// This is the subclass of Shape.java
public class Circle extends Shape{
    
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    // we need to override this method as due to abstarct keyword
    // The child classes need to implement this
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
