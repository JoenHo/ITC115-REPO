//###################################################################
// Class: DVD
// Description: DVD class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class DVD extends Library {
    //-----------------------
    // Fields
    //-----------------------
    String genre;
    double rating;

    //-----------------------
    // Constructor
    //-----------------------
    public DVD(int number, String title, String genre, double rating){
        super(number, title);
        this.genre = genre;
        this.rating = rating;
    }

    //-----------------------
    // Methods
    //-----------------------
    public void printSummary() {
        System.out.println("===========================================");
        System.out.println(String.format("<DVD>\nItem Numver: %d\nDVD Title: %s\nGenre: %s\nRating: %f out of 5", super.getItemNumber(),super.getItemTitle(), this.genre, this.rating));        
        System.out.println("===========================================");

    }
}
