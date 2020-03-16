//###################################################################
// Class: BuyTicket
// Description: BuyTicket class
// By: J.Ho
// Date: 03/15/2020
//###################################################################
public class BuyTicket{
    
    public static void main(String[] args){
        //-----------------------------------
		// generate class objects and printout
        //-----------------------------------
        // Walkup Ticket1: #65
        System.out.println(new WalkupTicket(65).toString());	

        // Advance Ticket1: #101, 10 days advance
        System.out.println(new AdvanceTicket(101, 10).toString());

        // Advance Ticket2: #98, 9 days advance
        System.out.println(new AdvanceTicket(98, 9).toString());		

        // Advance Ticket3: #13, -6 days advance
        System.out.println(new AdvanceTicket(13, -6).toString());	
        		

    }
}