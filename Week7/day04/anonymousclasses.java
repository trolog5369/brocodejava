
public class anonymousclasses {
    public static void main(String[] args) {
        // Anonymous classes= A class that dosen't have a name,Cannot be reused
        //                    Add custom behaviour without having to create a new class.
        //                    Often used for one time uses(TimerTask,Runnable,callbacks)(these are advanced java concepts)

        // Anonymous classes is used to create custom templates/nehaviour without creating a new class
        // IE when a class have exact the same features as other just some features are different so rather than creating an entire
        // class anonymous class help us.

        // Firstly we created a Dog class which have speak() method.

        System.out.println("Before anonymous classes: ");
        Dog dog1=new Dog();
        dog1.speak();
        // Works fine for all the dogs 

        // But what if the dog is scooby do is a case he speaks english as he's a special type of dog
        // Then we have 2 options: 
        // 1.rather create a new Class in this case:(TalkingDog) 
        // 2..use anonymous class 

        // Creating a new Dog class ie TalkingDog() and overriding the speak method of the parent Dog()
        TalkingDog talkingDog=new TalkingDog();
        talkingDog.speak();

        // This methods works but to just change 1 feature we craeted an entire class 
        // which is not good pratice hence we used anonymous Classes

        System.out.println("After anonymous classes: ");
        Dog dog2=new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Do goes Ruh Roh");
            }
        };
        dog2.speak();

        // This is anymous class it do not have a name, it can't be reused if we want to reuse it better create a new class
        // It helps user to add custom behaviour without creating a new class
   
        // To craete an anonymous class after the object add a set of {}; and just speicfy the behaviour
    }
}
