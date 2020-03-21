//###################################################################
// Class: HarvardLawyer
// Description: HarvardLawyer class
// By: J.Ho
// Date: 03/21/2020
//###################################################################
public class HarvardLawyer extends Employee {

    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        return "pinkpinkpinkpink";
    }
}
