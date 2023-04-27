import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("ENTER THE LAST RANGE : ");
        int range = input.nextInt();

        int number = random.nextInt(range) + 1;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
        System.out.println("I'M THINKING OF A NUMBER BETWEEN 1 AND " + range);
        System.out.println("YOU HAVE " + maxAttempts + " ATTEMPTS TO GO IT.");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) 
        {
            System.out.print("ENTER YOUR GUESS : ");
            int guess = input.nextInt();

            if (guess == number) 
            {
                System.out.println("CONGRATULATIONS, YOU GUESSED IT IN " + attempts + " ATTEMPTS!");
                score += (maxAttempts - attempts + 1);
                break;
            } 
            else if (guess < number) 
            {
                System.out.println("SORRY, YOUR GUESS IS TOO LOW");
            } 
            else 
            {
                System.out.println("SORRY, YOUR GUESS IS TOO HIGH.");
            }
        }

        if (score == 0) 
        {
            System.out.println("SORRY, YOU DID NOT GUESS THE NUMBER. IT WAS " + number);
        } 
        else 
        {
            System.out.println("YOUR SCORE IS : " + score);
        }
        input.close();
    }
}
