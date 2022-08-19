import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        guessingNumberGame(8);
    }

    //Function for guessing the number game accepting number of trials as argument
    public static void guessingNumberGame(int turns)
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100
                * Math.random());


        int i, guess;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within" +" "+turns+" " +"trials.");


        // Iterate over K Trials
        for (i = 0; i < turns; i++) {

            System.out.println(
                    "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != turns - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess && i != turns - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == turns) {
            System.out.println(
                    "You have exhausted"
                            + " K trials.");

            System.out.println(
                    "The number was " + number);
        }
    }
}
