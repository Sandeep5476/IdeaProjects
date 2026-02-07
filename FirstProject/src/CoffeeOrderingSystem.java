import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        char ch1 = '\u263A';
        char ch2 = '\u2615';
        char ch3 = '\u20b9';
        System.out.println(ch1+" "+"Welcome to coffee cafe!"+" "+ch2);
        System.out.println("***********************************");
        System.out.println();
        System.out.println("choose your coffee: ");
        System.out.println("1. Espresso - "+ch3+"200");
        System.out.println("2. Cappuccino - "+ch3+"250");
        System.out.println("3. Latte - "+ch3+"300");
        int choice;
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        if(choice > 3){
            System.out.println("Invalid choice");
        }else{
            if(choice == 1){
                int espresso = 200;
                System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
                int wippedcream = sc.nextInt();
                if(wippedcream == 0){
                    System.out.println(espresso);
                }else if(wippedcream == 1){
                    System.out.println(espresso+30);
                    System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
                    int flavshot = sc.nextInt();
                    if(flavshot == 1){
                        System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                        int vanilla = 20,hazelnut=25;
                        int flavchoice = sc.nextInt();
                        if(flavchoice == 1){
                            System.out.println(espresso+30+20);
                        }
                        else if(flavchoice==2){
                            System.out.println("Total BIll = "+(espresso+30+25));
                        }
                    }
                }

            }if(choice == 2){
                int cappuccino = 250;
                System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
                int wippedcream = sc.nextInt();
                if(wippedcream == 0){
                    System.out.println(cappuccino);
                }else if(wippedcream == 1){
                    System.out.println(cappuccino+30);}
                    System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
                    int flavshot = sc.nextInt();
                    if(flavshot == 1){
                        System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                        int vanilla = 20,hazelnut=25;
                        int flavchoice = sc.nextInt();
                        if(flavchoice == 1){
                            System.out.println(cappuccino+30+20);
                        }
                        else if(flavchoice==2){
                            System.out.println("Total BIll = "+(cappuccino+30+25));
                        }
                    }else if(flavshot==0){
                        System.out.println(cappuccino+30);
                    }
                }

            }

        }
    }

