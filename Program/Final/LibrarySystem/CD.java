//###################################################################
// Class: CD
// Description: CD class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class CD extends Library {

    //-----------------------
    // Fields
    //-----------------------
    String author;
    int releaseYear;

    //-----------------------
    // Constructor
    //-----------------------
    public CD(int number, String title, String author, int year){
        super(number, title);
        this.author = author;
        this.releaseYear = year;
    }

    //-----------------------
    // Methods
    //-----------------------
    public void printSummary() {
        System.out.println("===========================================");
        System.out.println(String.format("<CD>\nItem Numver: %d\nCD Title: %s\nAuthor: %s\nReleased: %d", super.getItemNumber(),super.getItemTitle(), this.author, this.releaseYear));        
        System.out.println("===========================================");

    }

}
