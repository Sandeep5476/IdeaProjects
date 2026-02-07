package ConstructorCodingExercises;

public class ProductInfo {
    private String productName;
    private String productCode;
    private String category;
    private float price;
    private short quantity;
    //creating getter and setter methods
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public void setQuantity(short quantity){
        this.quantity=quantity;
    }
    public short getQuantity(){
        return quantity;
    }
    public String getProductName(){
        return productName;
    }
    public String getProductCode(){
        return productCode;
    }
    public ProductInfo(String productName,String productCode,String category,float price,short quantity){
        this.productName=productName;
        this.productCode=productCode;
        this.category=category;
        this.price=price;
        this.quantity=quantity;
    }
    public ProductInfo(String productName,String productCode,short quantity){
        this.productName=productName;
        this.productCode=productCode;
        this.quantity=quantity;
    }
}
