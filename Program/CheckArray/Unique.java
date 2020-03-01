/* 
 write a method called isUnique that accepts an array of integers as a parameter 
 and returns a boolean value indicating whether or not the value in the array are unique 
 (true for yes, false for no). the value in the list are considered unique 
 if there is no pair of value that are equal. 
 for example, if passed an array containing [3,8,12,2,9,17,43,-8,46], 
 your method should return true, but if passed [4,7,3,9,12,-47,3,74],
 your method should return false because the value 3 appears twice 
 */
//###################################################################
// Class: Unique
// Description: Unique class
// By: J.Ho
// Date: 03/01/2020
//###################################################################
public class Unique {

	//###############################################################
	// Method: main()
	// Description: testing isUnique()
	// By: J.Ho
	// Date: 03/01/2020
	//###############################################################
	public static void main(String[] args) {
		//-------------------
		// TEST
		//-------------------
		// 1) [3,8,12,2,9,17,43,-8,46] --> true
		int arr1[] = {3,8,12,2,9,17,43,-8,46};
		System.out.println(isUnique(arr1));

		// 2) [4,7,3,9,12,-47,3,74] --> false
		int arr2[] = {4,7,3,9,12,-47,3,74};
		System.out.println(isUnique(arr2));

		// 3) [-3, -2, -1, 0, 1, 2, 3] --> ture
		int arr3[] = {-3, -2, -1, 0, 1, 2, 3};
		System.out.println(isUnique(arr3));

		// 4) [5, 6, 7, 8, -1, -1] --> false
		int arr4[] = {5, 6, 7, 8, -1, -1};
		System.out.println(isUnique(arr4));

	}


/* for example, if passed an array containing [3,8,12,2,9,17,43,-8,46], 
 your method should return true, but if passed [4,7,3,9,12,-47,3,74] */
	//###############################################################
	// Method: isUnique()
	// Description: check if the value in an array of integers is unique.
	// By: J.Ho
	// Date: 03/01/2020
	//###############################################################
	public static boolean isUnique(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					return false;
				}
			}
		}
		return true; 
	}

}
