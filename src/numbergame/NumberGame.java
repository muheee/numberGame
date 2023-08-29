package numbergame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        int totalRounds = 0;
        
        while (true) {
            rounds++;
            totalRounds++;
            
            int targetNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            System.out.println("Round " + rounds + ": Guess the number between " + lowerRange + " and " + upperRange);
            
            int attempts = 0;
            while (attempts < maxAttempts) {
                attempts++;
                totalAttempts++;
                System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number " + targetNumber + " in " + attempts + " attempts!");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Game over! You played " + totalRounds + " rounds and took " + totalAttempts + " total attempts.");
    }
}

