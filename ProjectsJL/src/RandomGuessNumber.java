import java.util.Random;
import java.util.Scanner;

public class RandomGuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int noOfAttempts;
        System.out.println("\n-----------------------------------");
        System.out.println("Welcome to number guessing game");
        System.out.println("-----------------------------------\n");
        System.out.println("Choose the difficulty level (Easy//Medium//Hard)");
        String diffcultyLevel = sc.next().toLowerCase();

//        if(diffcultyLevel.equals("easy")){
//            noOfAttempts = 10;
//        }else if(diffcultyLevel.equals("medium")){
//            noOfAttempts = 7;diffcultyLevel.equals("hard"){
//                noOfAttempts = 5;
//            }
//        }else{
//            noOfAttempts = -1;
//        }
        noOfAttempts = switch (diffcultyLevel){
            case "easy"->10;
            case "medium"->7;
            case "hard"->5;
            default -> {
                System.out.println("Invalid choice");
                yield -1;
            }
        };

        while(noOfAttempts>0){
            System.out.println("Guess the number between 1 to 100");
            int guessNumber = sc.nextInt();
            if(guessNumber < 1 || guessNumber > 100){
                System.out.println("Please enter a valid number!!! Try again...");
                continue;
            }
            if(guessNumber == randomNumber){
                System.out.println("You have guessed the correct number!!! You Won!!!");
                break;
            }
            else{
                if(guessNumber<randomNumber){
                    System.out.println("Too Low and Try again...");
                }
                else{
                    System.out.println("Too high and Try again...");
                }
                noOfAttempts--;
                System.out.println("You have "+noOfAttempts+" attempts left  to guess the number ");
            }
            if(noOfAttempts == 0){
                System.out.println("You Lost");
                System.out.println("The correct number was "+randomNumber);
            }

        }
    }
}
