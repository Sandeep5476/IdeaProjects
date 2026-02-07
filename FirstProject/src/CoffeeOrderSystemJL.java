import java.util.Scanner;

public class CoffeeOrderSystemJL {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*************************");
            System.out.println("\u263A welcome to coffee! \u2615");
            System.out.println("*************************");
            System.out.println(" 1.\tEspresso – ₹200");
            System.out.println("2.\tCappuccino – ₹250");
            System.out.println("3.\tLatte – ₹300");
            System.out.println("Enter your choice");

            choice = sc.nextInt();
            double bill = 0;
//        if (choice == 1) {
//            bill += 200;
//        } else if (choice == 2) {
//            bill += 250;
//        } else if (choice == 3) {
//            bill += 300;
//        }else{
//            System.out.println("invalid choice");
//        }
            bill = switch (choice) {
                case 1 -> bill += 200;
                case 2 -> bill += 250;
                case 3 -> bill += 300;
                default -> {
                    System.out.println("Invalid coffee choice! Please try again");
                    yield -1;
                }
            };

            if (bill > 0) {
                System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
                int whippedcreamchoice = sc.nextInt();
                if (whippedcreamchoice == 1) {
                    bill += 30;
                }
                System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
                int flavour = sc.nextInt();

                if (flavour == 1) {
                    int flavchoice;
                    do {
                        System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                        flavchoice = sc.nextInt();

//                if(flavchoice == 1){
//                    bill += 20;
//                }else if(flavchoice == 2){
//                    bill += 25;
//                }

                        bill = switch (flavchoice) {
                            case 1 -> {
                                bill += 20;
                                yield bill;
                            }
                            case 2 -> {
                                bill += 25;
                                yield bill;
                            }
                            default -> {
                                System.out.println("Invalid flavour choice");
                                yield bill;
                            }
                        };
                    } while(flavchoice != 1 && flavchoice != 2);

                }
                System.out.println("the total bill is:\t " + bill);
            }

        }while (choice < 1 || choice > 3) ;
    }
}