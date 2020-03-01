/*
 write a method called isSorted that accepts an array of real number as parameter
 and returns true if the list in in sorted (nondecreasing) order and false otherwise. 
 for example, if array named list1 and list2 store [16.1, 12.3, 22.2, 14.4] and 
 [1.5,4.3,7.0,19.5,25.1,46.2] respectively, the calls isSorted(list1) and isSorted(list2) 
 should return false and true respectively. Assume the array has at least one element. 
 A one-element array is considered to be sorted
 */
//###################################################################
// Class: Sort
// Description: Sorting class
// By: J.Ho
// Date: 03/01/2020
//###################################################################
public class Sort {

	//###############################################################
	// Method: main()
	// Description: testing isSorted()
	// By: J.Ho
	// Date: 03/01/2020
	//###############################################################
	public static void main(String[] args) {
		//-------------------
		// TEST
		//-------------------
		// 1) [16.1, 12.3, 22.2, 14.4] --> false
		double arr1[] = {16.1, 12.3, 22.2, 14.4};
		System.out.println(isSorted(arr1));

		// 2) [1.5,4.3,7.0,19.5,25.1,46.2] --> true
		double arr2[] = {1.5,4.3,7.0,19.5,25.1,46.2};
		System.out.println(isSorted(arr2));

		// 3) [8.0] --> true
		double arr3[] = {8.0};
		System.out.println(isSorted(arr3));

		// 4) [-3.3, -1.0, 0.0, 5.0, 2.0] --> false
		double arr4[] = {-3.3, -1.0, 0.0, 5.0, 2.0};
		System.out.println(isSorted(arr4));

	}

	//###############################################################
	// Method: isSorted()
	// Description: check if an array of real number is sorted(increasing).
	//              *one-element array is considered to be sorted.
	// By: J.Ho
	// Date: 03/01/2020
	//###############################################################
	public static boolean isSorted(double[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}

}
