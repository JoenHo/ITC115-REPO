import java.text.NumberFormat;

//###################################################################
// Class: GenericProduct
// Description: GenericProduct class
// By: J.Ho
// Date: 03/07/2020
//###################################################################
public class GenericProduct {

    //----------------------
    // Data
    //----------------------
    private int productCode;
    private String productDescription;
    private double productPrice;
    private int productCount;
    private static int objCount = 0;

    //----------------------
    // Constructor
    //----------------------
    public GenericProduct(int code, String description, double price, int count){
        this.productCode = code;
        this.productDescription = description;
        this.productPrice = price;
        this.productCount = count;
        objCount++;
    }

    //----------------------
    // getter & setter
    //----------------------
    public int getProductCode() {
        return this.productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return this.productDescription;
    }

    public void setDescription(String description) {
        this.productDescription = description;
    }

    public double getPrice() {
        return this.productPrice;
    }

    public void setPrice(double price) {
        this.productPrice = price;
    }

    public int getProductCount() {
        return this.productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public static int getObjCount() {
        return objCount;
    }


    //----------------------
    // toString()
    //----------------------
    @Override
    public String toString() {
        String strPrice = getPriceFormatted();
        return "★ GenericProduct [Product Code=" + this.productCode + ", Description=" + this.productDescription + ", Price=" + strPrice
                + ", Quantities=" + this.productCount + "]";
    }

    public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
        return formattedPrice;
    }

}
