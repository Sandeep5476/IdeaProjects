package ConstructorCodingExercises;

public class ProductInfoMain {
    public static void main(String[] args) {
        ProductInfo obj1 = new ProductInfo("laptop","laptop12345code",(short)100);
        System.out.println("product Name: "+obj1.getProductName());
        System.out.println("Product Code: "+obj1.getProductCode());
        System.out.println("Quantity: "+obj1.getQuantity());
        System.out.println();
        ProductInfo obj2 = new ProductInfo("laptop2","laptop123456code","gaming laptops",67000.5f,(short)100);
        System.out.println("product Name: "+obj2.getProductName());
        System.out.println("Product Code: "+obj2.getProductCode());
        System.out.println("Category: "+obj2.getCategory());
        System.out.println("Quantity: "+obj2.getQuantity());
        System.out.println("Price: "+obj2.getPrice());

    }
}
