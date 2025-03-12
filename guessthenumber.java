import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int secretNumber = 5;

        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        while (guess != secretNumber) {
            System.out.print("Guess the number! ");
            guess = scanner.nextInt();

            if (guess != secretNumber) {
                System.out.println("That's wrong, try again!");
            }
        }

        System.out.println("Correct!");
    }
}