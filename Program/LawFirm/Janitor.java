//###################################################################
// Class: Janitor
// Description: Janitor class
// By: J.Ho
// Date: 03/21/2020
//###################################################################
public class Janitor extends Employee {
    
    public int getHours() {
        return super.getHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() - 10000.0;
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public String clean() {
        return "Workin' for the man.";
    }
}
