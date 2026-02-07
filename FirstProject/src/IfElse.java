import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        int rate;
        Random rand = new Random();
        rate = (1+(Math.abs(rand.nextInt()))%50);
        System.out.println("rate = "+rate);
        if(rate >= 40){
            System.out.println("you can buy what you need");
        }
        else
            if(rate>=30){
                System.out.println("You can buy 1.5 times what you need");
            }
            else
                if(rate == 20){
                    System.out.println("You can buy 2 times what you need");
                }
                else
                    if(rate < 20){
                        System.out.println("you can buy 2.5 times the quantity you need");
                    }
    }
}
