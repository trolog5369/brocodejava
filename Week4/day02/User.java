
public class User {
    String username;
    String email;
    int age;
    // What if some of attributes (fileds) are optional hence we will create an constructor inside
    // the class(constructor)

    // for eg:What if there's a user with only username?
    User(String username){
        this.username=username;
        // default values assigned to email and age
        this.email="not provided";
        this.age=0;
    }

    // WE CAN CRAETE AN SAME CONSTRUCTORS WITH THE SAME NAME BUT THE PARAMETER SHOULD BE DIFFERENT

    // for eg: what if there's an user with email and username
    // we craeted a constructor with the same name as the previous one but parameter is diff so its works
    User(String username,String email){
        this.username=username;
        this.email=email;
        // default values assigned to age
        this.age=0;
    }

    // for eg: what if there's an user with email,username and also age(ALL ATTRIBUTES INCLUDED)
    User(String username,String email,int age){
        this.username=username;
        this.email=email;
        this.age=age;
    }

    // for eg:What if user is an anonmous(guest) profile? ie no age,username,email (NO ATTRIBUTES INCLUDED)
    User(){
        this.username="Guest";
        this.email="not provided";
        this.age=0;
    }
}

// We can create different objects with a varing number of objects