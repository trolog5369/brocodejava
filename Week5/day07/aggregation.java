
public class aggregation {
    public static void main(String[] args) {
        // Agregation= Reprsents a "has-a" relationship between objcets 
        //             One object contains another object as part of its structure.
        //             but the contained objects/s can exist independently

        //Objects can exist independently but one object contain another object as the part of its structure

        Book book1=new Book("The Fellow of the Ring", 423);
        Book book2=new Book("The Two Towers", 352);
        Book book3=new Book("The Return of the King", 416);

        Book[] books={book1,book2,book3};

        // Using the enhance for loop 
        for(Book book:books){
            System.out.println(book.displayInfo());
        }
        // The Fellow of the Ring (423 pages)
        // The Two Towers (352 pages)
        // The Return of the King (416 pages)

        System.out.println();

        Library library=new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
// The book object has a relationship with the library object but it can exist independently

// The library class conatins the book object without owning it