//###################################################################
// Class: Book
// Description: Book class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class Book extends Library {

    //-----------------------
    // Fields
    //-----------------------
    String author;
    int publishYear;

    //-----------------------
    // Constructor
    //-----------------------
    public Book(int number, String title, String author, int year){
        super(number, title);
        this.author = author;
        this.publishYear = year;
    }

    //-----------------------
    // Methods
    //-----------------------
    public void printSummary() {
        System.out.println("===========================================");
        System.out.println(String.format("<Book>\nItem Numver: %d\nBook Title: %s\nAuthor: %s\nPublish Year: %d", super.getItemNumber(),super.getItemTitle(), this.author, this.publishYear));        
        System.out.println("===========================================");

    }

}
