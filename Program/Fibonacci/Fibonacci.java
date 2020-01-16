
public class Fibonacci {

	public static void main(String[] args) {
		
		//=====================================
		// Print the first 12 Fibonacci numbers
		//=====================================
		// The first 12 Fibonacci numbers are:
		// 1 1 2 3 5 8 13 21 34 55 89 144
		
		int numPre1 = 0;		// second Fibonacci number before numCurrent 	
		int numPre2 = 1;		// first Fibonacci number before numCurrent
		int numCurrent = 0;		// current Fibonacci number
				
		// print the first 12 Fibonacci numbers
		for(int i = 0; i < 12; i++) {
			
			// compute the sum of the two preceding numbers 
			numCurrent = numPre1 + numPre2;
			
			// print number
			System.out.println(numCurrent-numPre1);
			
			// reassign numbers
			numPre1 = numPre2;
			numPre2 = numCurrent;
		}		
	}
}
