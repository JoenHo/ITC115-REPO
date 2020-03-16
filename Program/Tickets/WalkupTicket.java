import java.text.NumberFormat;

//###################################################################
// Class: WalkupTicket
// Description: WalkupTicket class
// By: J.Ho
// Date: 03/15/2020
//###################################################################
public class WalkupTicket extends Ticket {

	public WalkupTicket(int number) {
		super(number);
	}

	public double getPrice(){
		return 50.0;
	}

	public String toString() {
		String strPrice = NumberFormat.getCurrencyInstance().format(getPrice());
        return String.format("Number: %d, Price: %s", super.getTicketNumber(), strPrice);        
    }

}
