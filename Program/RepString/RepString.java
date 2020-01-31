
//###################################################################
// Class: RepString
// Description: concatenate a given string with itself of a given number of times
// By: J.Ho
// Date: 01/31/2019
//###################################################################
public class RepString {

	//###############################################################
	// Method: main
	// Description: call repl() to get concatenated string and print it out
	// By: J.Ho
	// Date: 01/31/2019
	//###############################################################
	public static void main(String[] args) {

		//-------------------
		// TEST
		//-------------------
		// 1) pass "hello", 3, get "hellohellohello" as return
		System.out.println(repl("hello", 3));
		
		// 2) pass the number of repetitions is zero, get an empty string as return
		System.out.println(repl("hello", 0));

		// 3) pass the number of repetitions less than zero, get an empty string as return
		System.out.println(repl("hello", -1));

		// 4) pass "Java", 5, get "JavaJavaJavaJavaJava" as return
		System.out.println(repl("Java", 5));
	}

	//###############################################################
	// Method: repl
	// 		accepts a String and a number of repetitions as parameters 
	//		and returns the String concatenated that many times
	// By: J.Ho
	// Date: 01/31/2019
	//###############################################################
	public static String repl(String str, int iRep){

		String concatStr = "";		// concatenated string

		// loop iRep times (skip when iRep is less than zero)
		for(int i = 0; i < iRep; i++)
		{
			// concatenate accepted string
			concatStr += str;
		}

		// return concatenated string
		return concatStr;
	}
}
