import java.util.*;
import java.io.*;

//==================================================================
// Class: BoysGirls
// Description: read the file and print the absolute difference between two numbers
// By: J.Ho
// Date: 02/14/2020
//==================================================================
public class BoysGirls {

	//-------------------
	// static variables
	//-------------------
	public static final String FILE_NAME = "BoysGirls/boysgirls.txt";

	//==================================================================
	// Method: main()
	// Description: read file and pass the contents to boysGirls()
	// By: J.Ho
	// Date: 02/14/2020
	//==================================================================
	public static void main(String[] args) {
		try{
			// generate File class object
			File file = new File(FILE_NAME);

			// generate Scanner class object
			Scanner input = new Scanner(file);
			
			// call boysGirls()
			boysGirls(input);
			
			// close scanner object
			input.close();

		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	}

	//==================================================================
	// Method: boysGirls()
	// Description: accepts a Scanner that is containing a series of names followed by integers.
	//				compute the absolute difference between the two sum of integers and print it out.
	// By: J.Ho
	// Date: 02/14/2020
	//==================================================================
	public static void boysGirls(Scanner input){

		int countLine = 0;			// count of line
		int numBoy = 0;				// number of boys line
		int numGirl = 0;			// number of girls line
		int sumBoy = 0;				// sum of boy's integer
		int sumGirl = 0;			// sum of girl's integer

		while(input.hasNextLine())
		{
			String str = input.next();	// read the name
			int num = input.nextInt();	// read the integer

			// devide into two group (alternate between boys and girls)
			if(countLine % 2 == 0){
				sumBoy += num;
				numBoy++;
			}
			if(countLine % 2 != 0){
				sumGirl += num;
				numGirl++;
			}
			countLine++;
		}

		// output the result
		System.out.println(String.format("%d boys, %d girls\nDifference between boys' and girls' sums: %d", numBoy, numGirl, Math.abs(sumBoy - sumGirl)));
	}
}
