public class PrimeFinder {
    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        else if (number == 2 || number == 3) {
            return true;
        }

        else {
            for (int value = 2; value < number; value++) {
                int result = number % value;
                if (result == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        boolean result = isPrime(24);
        System.out.println(result);
    }
}
