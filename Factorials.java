package lab3;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer value to find the factorial of: ");
        int input = scanner.nextInt();
        double finalValue = 1;
        for (int i = 2; i <= input; i++) {
            finalValue *= i;
        }
        System.out.println("The factorial of " + input + " is " + finalValue);
    }
}
