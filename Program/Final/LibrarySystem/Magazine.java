//###################################################################
// Class: Magazine
// Description: Magazine class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class Magazine extends Library {
    //-----------------------
    // Fields
    //-----------------------
    String genre;
    double price;

    //-----------------------
    // Constructor
    //-----------------------
    public Magazine(int number, String title, String genre, double price){
        super(number, title);
        this.genre = genre;
        this.price = price;
    }

    //-----------------------
    // Methods
    //-----------------------
    public void printSummary() {
        System.out.println("===========================================");
        System.out.println(String.format("<Magazine>\nItem Numver: %d\nMagazine Title: %s\nGenre: %s\nPrice: $%f", super.getItemNumber(),super.getItemTitle(), this.genre, this.price));        
        System.out.println("===========================================");

    }
}
