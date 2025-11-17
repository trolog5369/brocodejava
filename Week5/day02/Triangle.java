
// This is the subclass of Shape.java
public class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    // we need to override this method as due to abstarct keyword
    // The child classes need to implement this
    @Override
    double area(){
        return 0.5*base*height;
    }
}
