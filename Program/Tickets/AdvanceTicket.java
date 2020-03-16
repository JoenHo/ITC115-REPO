import java.text.NumberFormat;

//###################################################################
// Class: AdvanceTicket
// Description: AdvanceTicket class
// By: J.Ho
// Date: 03/15/2020
//###################################################################
public class AdvanceTicket extends Ticket {

	private int daysAdvance;

	public AdvanceTicket(int number, int days) {
		super(number);
		this.daysAdvance = days;
	}

	public double getPrice(){

		if(daysAdvance >= 10){
			return 30.0;
		}
		else if(daysAdvance >= 0){
			return 40.0;
		}
		else{
			return -1.0;
		}
	}

	public String toString() {

		if(getPrice() == -1){
			return "Invalid number of days in davance.";	
		}

		String strPrice = NumberFormat.getCurrencyInstance().format(getPrice());
        return String.format("Number: %d, Price: %s", super.getTicketNumber(), strPrice);     
    }

}
