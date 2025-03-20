package lab3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to get the secret number! (note: it is an integer) It is different every time >:3");

        int guess;
        do {
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Number is smaller than your guess");
            }
            else if (guess < randomNumber) {
                System.out.println("Number is bigger than your guess");
            }
        }
        while (guess != randomNumber);
        System.out.println("Finally, took you long enough");
    }
}
