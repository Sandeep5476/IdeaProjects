import java.util.Scanner;

public class CalculatePrice {
    static double calculatePrice(int quantity,double price,boolean isMember){
        double totalPrice= quantity*price;
        if(isMember){
            totalPrice -= totalPrice * 0.15;
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Please enter a price: ");
        double price = sc.nextDouble();
        System.out.print("Please enter a isMember: ");
        boolean isMember = sc.nextBoolean();
        double result = calculatePrice(quantity,price,isMember);
        System.out.println(result);
    }
}
