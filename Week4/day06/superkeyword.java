
public class superkeyword {
    public static void main(String[] args) {
        // Super = Refers to the parent class(subclass<-Superclass)
        // Child class is also called as a subclass and 
        // Parent class is also known as the superclass

        // Super just means parent in contents

        //         Used in constructors and method overriding
        //         Calls the parent constructor to initilalize attributes

        Person person=new Person("Tom", "Riddle");
        person.showName();

        Student student=new Student("Harry", "Potter", 3.25);
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();

        Employee employee=new Employee("Rubeus", "Hagrid", 50000);
        employee.showSalary();
    }
}

