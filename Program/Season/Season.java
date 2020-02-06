//###################################################################
// Class: Season
// Description: indicate season by month and day
// By: J.Ho
// Date: 02/06/2020
//###################################################################
public class Season {

	//###############################################################
	// Method: main()
	// Description: call season() to get the season
	// By: J.Ho
	// Date: 02/06/2020
	//###############################################################
	public static void main(String[] args) {
		//-------------------
		// TEST
		//-------------------
		// 1) 12/16, 3/15, 1/28 ---> winter
		System.out.println("Expect winter");
		System.out.println(season(12, 16));
		System.out.println(season(3, 15));
		System.out.println(season(1, 28));

		// 2) 3/16, 6/15, 5/10 ---> spring
		System.out.println("Expect spring");
		System.out.println(season(3, 16));
		System.out.println(season(6, 15));
		System.out.println(season(5, 10));

		// 3) 6/16, 9/15, 8/1 ---> summer
		System.out.println("Expect summer");
		System.out.println(season(6, 16));
		System.out.println(season(9, 15));
		System.out.println(season(8, 1));

		// 4) 9/16, 12/15, 11/31 ---> fall
		System.out.println("Expect fall");
		System.out.println(season(9, 16));
		System.out.println(season(12, 15));
		System.out.println(season(11, 31));

		// 5) 0/5, 6/32, 13/0 ---> invalid number
		System.out.println("Expect winter");
		System.out.println(season(0, 5));
		System.out.println(season(6, 32));
		System.out.println(season(13, 0));
	}

	//###############################################################
	// Method: season()
	// Description: take month and day as parameter and return the season
	// By: J.Ho
	// Date: 02/06/2020
	//###############################################################
	
	public static String season(int month, int day)
	{
		String strSeason = "";
		// print the parameters passed
		System.out.print("<Month:" + month + " day:" + day + "> ");

		// check if the parameters are invalid
		if(month > 12 || month < 1 || day > 31 || day < 1)
		{
			strSeason = "invalid number";
			return strSeason;
		}

		// check if it's winter (12/16-3/15)
		if((month == 12 && day >= 16) || month == 1 || month == 2 || (month == 3 && day <=15))
		{
			strSeason = "winter";
		}
		// check if it's spring (3/16-6/15)
		else if((month == 3 && day >= 16) || month == 3 || month == 5 || (month == 6 && day <= 15))
		{
			strSeason = "spring";
		}
		// check if it's summer (6/16-9/15)
		else if((month == 6 && day >= 16) || month == 7 || month == 8 || (month == 9 && day <= 15))
		{
			strSeason = "summer";
		}
		// check if it's fall (9/16-12/15)
		else if((month == 9 && day >= 16) || month == 10 || month == 11 || (month == 12 && month <= 15))
		{
			strSeason = "fall";
			return strSeason;
		}

		return strSeason;
	}
}
