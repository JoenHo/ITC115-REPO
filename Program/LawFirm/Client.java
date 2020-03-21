//###################################################################
// Class: Client
// Description: Client class
// By: J.Ho
// Date: 3/21/2020
//###################################################################
public class Client {

	public static void main(String[] args) {
		
		//-------------
		// Testing
		//-------------
		Janitor janitor = new Janitor();
		HarvardLawyer hLawyer = new HarvardLawyer();

		// Janitor
		System.out.println("======Janitor=====");
		System.out.println("Working Hours: " + janitor.getHours());
		System.out.println("Salary: " + janitor.getSalary());
		System.out.println("Vacation Days: " + janitor.getVacationDays());
		System.out.println("Clean: " + janitor.clean());

		// HarvardLawyer
		System.out.println("======Harvard Lawyer=====");
		System.out.println("Salary: " + hLawyer.getSalary());
		System.out.println("Vacation Days: " + hLawyer.getVacationDays());
		System.out.println("Vacation Form: " + hLawyer.getVacationForm());
	}

}
