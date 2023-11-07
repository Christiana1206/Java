package inheritance.inheritancePractice4;

public class Book {

    //create title and pageNumber instance variables
    //create a constructor to initialize all the instance variables in this Book class
    //make the NoteBook class a subclass of this Book class
    //make the subclass call the parent class constructor
    //create a main method in this subclass to check with an object


    String title; //i can put static => it will be in the notebook class

    static int pageNumber;    //i can put static..

    public Book(String title, int pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
    }

    // I want to create a method to check/get the pageNumber of my object

    public int getPageNumber(){                      //cannot make a static, because we can't override the static method
        System.out.println("book page");
        return pageNumber;

    }


}
