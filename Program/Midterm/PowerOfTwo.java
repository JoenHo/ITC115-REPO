//==================================================================
// Class: PowerOfTwo
// Description: check if a number is powe pf two
// By: J.Ho
// Date: 02/24/2020
//==================================================================
public class PowerOfTwo {

	public static void main(String[] args) {
		//---------
		// test
		//---------
		System.out.println(isPowerOfTwo(0));	// false
		System.out.println(isPowerOfTwo(1));	// true
		System.out.println(isPowerOfTwo(5));	// false
		System.out.println(isPowerOfTwo(8));	// true
		System.out.println(isPowerOfTwo(-4));	// false
		System.out.println(isPowerOfTwo(32));	// true

	}

	public static boolean isPowerOfTwo(int num){
	
		boolean result = false;

		if (num <= 0) 
            return result; 
  
        while (num != 1) { 
            if (num % 2 != 0) 
				return result; 
            num = num / 2; 
        } 
        result = true; 
		return result;
	}

}
