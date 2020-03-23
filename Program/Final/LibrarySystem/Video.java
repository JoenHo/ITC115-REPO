//###################################################################
// Class: Video
// Description: Video class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class Video extends Library {
    //-----------------------
    // Fields
    //-----------------------
    String genre;
    double length;

    //-----------------------
    // Constructor
    //-----------------------
    public Video(int number, String title, String genre, double length){
        super(number, title);
        this.genre = genre;
        this.length = length;
    }

    //-----------------------
    // Methods
    //-----------------------
    public void printSummary() {
        System.out.println("===========================================");
        System.out.println(String.format("<Video>\nItem Numver: %d\nVideo Title: %s\nGenre: %s\nLength: %f hours", super.getItemNumber(),super.getItemTitle(), this.genre, this.length));        
        System.out.println("===========================================");

    }
}
