package ShoppingCart;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> cart = new LinkedList<>();
        while (true) {
            System.out.println("Shopping Cart menu:");
            System.out.println("1. Add item");
            System.out.println("2. Enter Item to Remove");
            System.out.println("3. View First Added Item");
            System.out.println("4. View Last Added Item");
            System.out.println("5. View All Items");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item to add: ");
                    String itemToAdd = sc.nextLine();
                    cart.add(itemToAdd);
                    System.out.println(itemToAdd + " added successfully.");
                    break;
                case 2:
                    if(!cart.isEmpty()){
                        System.out.print("Enter item name to remove: ");
                        String itemToRemove = sc.nextLine();
                        if (cart.remove(itemToRemove))
                            System.out.println(itemToRemove + " removed from the cart.");
                        else
                            System.out.println(itemToRemove + " not found in the cart.");
                    }else{
                        System.out.println("cart is empty.");
                    }
                    break;
                case 3:
                    if (!cart.isEmpty()) {
                        System.out.println("First added item is: " + cart.getFirst());
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;
                case 4:
                    if (!cart.isEmpty()) {
                        System.out.println("First added item is: " + cart.getLast());
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;
                case 5:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("Items in the cart: " + cart);
                    }
                    break;
                case 6:
                    System.out.println("Thank you for shopping.....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice pleae try Again....");

            }

        }
    }
}
