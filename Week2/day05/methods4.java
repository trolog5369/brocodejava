
public class methods4 {
public static void main(String[] args) {
    // Methods=block of reusable code that is executed when ()
    // we can write a code once and reuse it many times as per we wish we just have to call it

    // Methods also have capability to return a value
    double result=square(3);
    System.out.println(result);
    System.out.println(square(3));

    System.out.println(cube(3));

    String fullName=getFullName("Pranav", "Gaikwad");
    System.out.println(fullName);

    int age=21;
    if (ageCheck(age)==true) {
        System.out.println("You may signup!");
    }
    else{
        System.out.println("You must be 18+ to sign up");
    }

}

static double square(double number){
    return number*number;
}

static double cube(double number){
    return number*number*number;
}

 static String getFullName(String first,String last){
    return first+" "+last;
}

static boolean ageCheck(int age){
if (age>=18) {
    return true;
}
else{
    return false;
}
}
}



