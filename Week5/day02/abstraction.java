
public class abstraction {
    public static void main(String[] args) {
        // Abstarct=used to define classes and methods.
        //          Abstraction is the process of hiding the implementation details
        //          and showing only the essentails features;

        //          Abstract classes CAN'T be instantiated directly
        //          Can contain 'abstract' methods (which must be implemented)
        //          Can contain 'concrete' methods (which are inherited and defined in the class itslef)

        // Abstract and Concrete are opposite of each other

        // Abstarct  classes CAN'T be instantiated directly
        // Shape shape=new Shape();
        // error as Shape is abstracted we cannot craete of this class

        // This provides a secruity to the code as No-one can make the generic shape 
        //They can only make the given shapes={Circle,Triangle,Rectangle}

        Circle circle=new Circle(3);
        Triangle triangle=new Triangle(4,5);
        Rectangle rectangle=new Rectangle(6,7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
