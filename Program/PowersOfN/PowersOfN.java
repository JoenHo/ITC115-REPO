
public class PowersOfN {

	public static void main(String[] args) {
		
		// test cases
		printPowerOfN(4, 3);
		printPowerOfN(5, 6);
		printPowerOfN(-2,8);
		
		//-------------------------
		// expected result:
		// 1 4 16 64
		// 1 5 25 125 625 3125 15625
		// 1 –2 4 –8 16 –32 64 –128 256
		//-------------------------

	}
	
	public static void printPowerOfN(int base, int exponent) {
	
		String list = "";
		int num = 1;
		
		// loop exponent + 1 times
		for(int i = 0; i < exponent + 1; i++)
		{
			// add current number to the list
			list += num + " ";	
			
			// calculate (accumulator equivalent to num = num * base)
			num *= base;	
		}
		
		// print the list
		System.out.println(list);
	}
}
