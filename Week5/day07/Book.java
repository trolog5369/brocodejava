
// This class has a relationship with another class but can exist indenpendently
public class Book {
    String title;
    int pages;

    // Constructor
    Book(String title,int pages){
        this.title=title;
        this.pages=pages;
    }

    // method to display the book info.
    String displayInfo(){
        return this.title+" ("+this.pages+" pages)";
    }
}
