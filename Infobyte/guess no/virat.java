import java.util.*;

public class virat {
    private static int maxround = 3;
    private static int minrange = 100;
    private static int maxrange = 200;
    private static int maxattempt = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number In Each Round : 10\n");
        for (int i = 1; i <= maxround; i++) {
            int number = random.nextInt(maxrange) + minrange;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, minrange, maxrange,
                    maxattempt);
            while (attempts < maxattempt) {
                System.out.println("Enter your guess : ");
                int guess_number = scanner.nextInt();
                attempts = attempts + 1;

                if (guess_number == number) {
                    int score = maxattempt - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempts, score);
                    break;
                }

                else if (guess_number < number) {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,
                            maxattempt - attempts);
                }

                else if (guess_number > number) {
                    System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number,
                            maxattempt - attempts);
                }

            }

            if (attempts == maxattempt) {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number Is : %d\n\n", number);
            }
        }
        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        scanner.close();
    }
}