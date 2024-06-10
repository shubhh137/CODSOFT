import java.util.Random;
import java.util.Scanner;

class Nogame {
    public static void main(String[] args) {
        Random R = new Random();
        Scanner sc = new Scanner(System.in);
        
        int totalRounds = 0;
        int roundsWon = 0;

        while (true) {
            int Num = R.nextInt(100) + 1;
            int maxAttempts = 8;
            int tryCount = 0;

            System.out.println("This is a number guessing game. You have " + maxAttempts + " attempts to guess the number.");
            System.out.println("Let's see how many attempts you took.");
            //System.out.println(Num);

            while (tryCount < maxAttempts) {
                System.out.println("Enter your guess (1-100)");
                int userGuess = sc.nextInt();
                tryCount++;

                if (userGuess == Num) {
                    System.out.println("Correct! You Win.");
                    System.out.println("The number was " + Num);
                    System.out.println("Total number of attempts is " + tryCount);
                    roundsWon++;
                    break;
                } else if (Num > userGuess) {
                    System.out.println("The number is higher. Guess again.");
                } else {
                    System.out.println("The number is lower. Guess again.");
                }
            }

            if (tryCount == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The number was " + Num);
            }

            totalRounds++;

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = sc.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Score: " + (roundsWon * 100 / totalRounds) + "%");

        sc.close();
    }
}