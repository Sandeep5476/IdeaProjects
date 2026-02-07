package ConstructorCodingExercises;

public class Product {
    private String productName;
    private String productId;
    private double price;
    private int discount;
   //first constructor
    public Product(){
        this.productName="Unknown";
        this.productId="Unknown";
        this.price=500.0D;
        this.discount=10;
        System.out.println("first constructor is being called");
    }
    //second constructor
    public Product(String productName,String productId){
       this(productName,productId,100000,10);
        System.out.println("Second constructor is being called");
    }
    //third constructor
    public Product(String productName,String productId,double price,int discount){
        this.productName=productName;
        this.productId=productId;
        this.price=price;
        this.discount=discount;
        System.out.println("Third constructor is being called");

    }
    public double productDiscountedPrice(){
        return price-(price*discount/100);
    }
    public void displayDetails(){
        System.out.println("Product Name: "+this.productName);
        System.out.println("Product Id: "+this.productId);
        System.out.println("Price Rs: "+this.price);
        System.out.println("Discount: "+this.discount+" %");
        System.out.println("Discounted price in Rs: "+productDiscountedPrice());
    }

}
