package inheritance.inheritancePractice4;

public class NoteBook extends Book {

    //make the NoteBook class a subclass of this Book class
    //make the subclass call the parent class constructor
    //create a main method in this subclass to check with an object
    public NoteBook() {
        super("Harry Potter", 400); // => call a constructor of my parent class
    }
    //override the method from parent class
    public int getPageNumber() {
        System.out.println("notebook page"); // notebook page
        return pageNumber;
    }

    public static void main(String[] args) {
        Book book = new Book("Java", 790);
        System.out.println(book.pageNumber);

        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.pageNumber);

        System.out.println("-----------------------");



        System.out.println(book.getPageNumber());
        System.out.println(noteBook.getPageNumber());




        }

    }

