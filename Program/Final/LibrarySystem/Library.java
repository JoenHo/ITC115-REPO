import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.text.NumberFormat;

//###################################################################
// Class: Library
// Description: Library class
// By: J.Ho
// Date: 3/23/2020
//###################################################################
public abstract class Library {
    
    private int itemNumber;
    private String itemTitle;

    //-----------------------
    // Constructor
    //-----------------------
    public Library(int number, String title){
        this.itemNumber = number;
        this.itemTitle = title;
    }  

    //-----------------------
    // Methods
    //-----------------------
    public abstract void printSummary();

    public void reserved(){
        Random rd = new Random();
        int isReserved = rd.nextInt(2);
        if(isReserved == 0){
            System.out.println("This item is not reserved.");
        }
        else{
            System.out.println("This item is reserved.");
        }
    }

    private long daysLate(LocalDate DueDate, LocalDate checkInDate){
        long diff = ChronoUnit.DAYS.between(DueDate, checkInDate);
        return diff;
    }

    private String fineAccrued(long diff){
        if(diff <= 0){
            return "No Fine Accrued.";
        }

        long fine = 50 * diff;
        return NumberFormat.getCurrencyInstance().format(fine) + " Fine Accrued.";
    }

    public void checkedIn(String DueDate, String checkInDate){

        LocalDate dDate = LocalDate.parse(DueDate);
        LocalDate cDate = LocalDate.parse(checkInDate);

        long diff = daysLate(dDate, cDate);
        String fineMsg = fineAccrued(diff);
        System.out.println(fineMsg);
    }

    //-----------------------
    // Getter
    //-----------------------
    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemTitle() {
        return itemTitle;
    }

}
