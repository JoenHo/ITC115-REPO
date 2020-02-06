import java.util.Scanner;

//###################################################################
// Class: PrintGPA
// Description: print student's average score
// By: J.Ho
// Date: 02/06/2020
//###################################################################
public class PrintGPA {

	//###############################################################
	// Method: main()
	// Description: capture user input and pass to printGPA()
	// By: J.Ho
	// Date: 02/06/2020
	//###############################################################
	public static void main(String[] args) {
		// capture user input
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String userInput = console.nextLine();

		// call printGPA
		printGPA(userInput);

		// close scanner instance
		console.close();
	}

	//###############################################################
	// Method: printGPA()
	// Description: calculate and print a student's average score
	// By: J.Ho
	// Date: 02/06/2020
	//###############################################################
	public static void printGPA(String str)
	{
		double totalScore = 0.0;
		double aveScore = 0.0;

		// split string by whitespace
		String[] strArray = str.split(" ");
		
		// convert string to number
		int numScore = Integer.parseInt(strArray[1]);	// number of scores

		for(int i = 2; i < numScore + 2; i ++)
		{
			// add up all scores
			totalScore += Double.parseDouble(strArray[i]);
		}

		// calculate average score
		aveScore = totalScore / numScore;

		// sprint output
		System.out.println(strArray[0] + "'s grade is " + aveScore);
	}
}
