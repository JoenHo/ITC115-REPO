//###################################################################
// Class: UseGenericProduct
// Description: UseGenericProduct class
// By: J.Ho
// Date: 03/07/2020
//###################################################################
public class UseGenericProduct {

	public static void main(String[] args) {
		//-----------------------------------
		// generate products
		//-----------------------------------		
		GenericProduct obj1 = new GenericProduct(101, "Baking Powder", 8.99, 3);
		GenericProduct obj2 = new GenericProduct(102, "Shredded Mozzarella", 4.99, 8);
		GenericProduct obj3 = new GenericProduct(103, "Vanilla Ice Cream", 6.48, 12);

		//-----------------------------------
		// print out products information
		//-----------------------------------
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println("The Number of Generic Products Created: " + GenericProduct.getObjCount());
	}

}
