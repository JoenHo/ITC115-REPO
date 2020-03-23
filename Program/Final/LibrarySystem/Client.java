//###################################################################
// Class: Client
// Description: Client class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public class Client {

	public static void main(String[] args) {
    //-----------------------
    // Test
	//-----------------------
	// Book
	Book book = new Book(1123, "Harry Potter", "J.K. Rowling", 2004);
	book.reserved();
	book.checkedIn("2020-03-15", "2020-03-23");
	book.printSummary();
	System.out.println();

	// Magazine
	Magazine magazine = new Magazine(2341, "VOGUE", "Fashion", 4.69);
	magazine.reserved();
	magazine.checkedIn("2020-05-10", "2020-03-23");
	magazine.printSummary();
	System.out.println();	

	// Video
	Video video = new Video(6005, "The Ring", "Horror", 1.36);
	video.reserved();
	video.checkedIn("2020-02-20", "2020-03-23");
	video.printSummary();
	System.out.println();
	
	// DVD
	DVD dvd = new DVD(2020, "Parasite", "Drama/Mystery", 4.99);
	dvd.reserved();
	dvd.checkedIn("2020-03-23", "2020-03-23");
	dvd.printSummary();
	System.out.println();	

	// CD
	CD cd = new CD(1123, "Take Me Home, Country Roads", "John DEnver", 1971);
	cd.reserved();
	cd.checkedIn("2020-01-28", "2020-03-23");
	cd.printSummary();
	System.out.println();
	
	}

}
