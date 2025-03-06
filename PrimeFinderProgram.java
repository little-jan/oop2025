import java.util.Scanner;

public class PrimeFinderProgram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter a start value");
        System.out.println("NOTE: it has to be an integer");
        int start = obj.nextInt();

        System.out.println("Please enter an end value");
        System.out.println("NOTE: it has to be an integer");
        int end = obj.nextInt();

        int values = PrimeFinder.countPrimes(start, end);
        System.out.println("The number of primes between " + start + " and " + end + " are: " + values);
    }
}
