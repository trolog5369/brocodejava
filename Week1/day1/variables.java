public class variables {

public static void main(String[] args) {

//     variables=a resuable container for a value
//                a variable behaves as if it was the value it contains

// Primitive =simple value stored directly in memory(stack) eg-I gave you 10rs.
// Reference=memory address (stack) that points to the (heap) eg-I owe you 10rs. the 10rs are in the bank

// primitive vs Reference
// ---------    ---------
// int           String
// double        array
// char          object
// boolean


// 2 steps to creating a variable
// -------------------------------
// 1.decleration
// 2.assignment

// Creating variables primitive 

// 1.integar variable:Integar are whole numbers hence no floating(decimal) value can be assigned
    
int age=21;
// int age=30.5;incompatible datatype
int year=2025;
int quantity=1;
System.out.println(age);
System.out.println(quantity);
System.out.println("the year is " + year);

// 2.double variable:double are floating pt numbers ie decimal numbers
double price=1999.99;
double gpa=3.5;
double temp=-12.5;

System.out.println("$"+price);

// 3.char varible:Char are characters
char grade='A';
char symbol='!';
char currency='$';

System.out.println(grade);
System.out.println(symbol);
System.out.println(currency);

// 4.Boolean variable:True or false
boolean isStudent =true;
boolean forSale=false;
boolean isOnline=true;
// isStudent,forSale,isOnline are decleared using camelConvention naming

System.out.println(isStudent);
System.out.println(forSale);
System.out.println(isOnline);
// We dont directly print boolean statements but use them internally in program ie in loops


// Creating variables refrence
// 1.Strings:Series/sequence of characters enclosed in ""
String name="Pranav"; 
String food="Pizza";
String email="fake123@gmail.com";
String colour="red";
String car="Mustang";
System.out.println("Hello "+ name); //string in string ie string conconatation
System.out.println("Your favourite food is "+ food);
System.out.println("your email is "+ email);

// Uisng every thing now 
System.out.println("Hello "+name);
System.out.println("Your gpa is "+gpa);
System.out.println("Your average letter grade is: "+grade);

// printing multiples var in one print statement 
System.out.println("Your choice is a "+colour +" " +year+" " +car);
System.out.println("The price is: "+currency+price);

if (forSale) {
    System.out.println("There is a "+car+ " for sale");
}
else{
    System.out.println("There is a "+car+ "  not for sale");

}
// forSale is false hence else statement gets executed!


}

}
