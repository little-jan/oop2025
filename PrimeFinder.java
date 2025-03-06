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
    public static int countPrimes(int start, int end) {
        int count = 0;
        for (int value = start; value < end; value++){
            boolean outcome = isPrime(value);
            if (outcome) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int counting = countPrimes(1, 204);
        System.out.println(counting);
    }
}
