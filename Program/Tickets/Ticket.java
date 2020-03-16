
//###################################################################
// Class: Ticket
// Description: Ticket class
// By: J.Ho
// Date: 03/15/2020
//###################################################################
abstract public class Ticket {

    private int ticketNumber;

    public Ticket(int number) {
        this.ticketNumber = number;
    }

    public abstract double getPrice();

    public abstract String toString();

    public int getTicketNumber(){
        return ticketNumber;
    };

}
