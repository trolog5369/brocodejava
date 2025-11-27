
public class Library {
    String name;
    int year;
    Book [] books;//Has a realtion ie aggregation the book object is been utilized here

    Library(String name,int year,Book[] books){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void displayInfo(){
        System.out.print("The "+this.year+" "+this.name);
        System.out.println("Books avaliable: ");
        for(Book book:books){
            System.out.println(book.displayInfo());
        }
    }
}
