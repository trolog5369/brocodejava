
// This is a subclass of the superclass(Person)
public class Employee extends Person{
    // As the Employeee extends the person class it will already have its attributes 
    // ie First,Last and showname method
    int salary;

    Employee(String first,String last,int salary){
        // this.first=first;
        // this.last=last;
        // same problem again if we use this so will use super keyword

        super(first,last);
        this.salary=salary;
    }
    void showSalary(){
        System.out.println(this.first+"'s salary is $"+this.salary);
    }
}
