public class prime {
    public static void main(String[] args) {
        // Hardcoded input
        int[] numbersToCheck = {2, 17, 18, 29, 42};

        // Check and display results for each number
        for (int number : numbersToCheck) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Check divisors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, it's prime
    }
}
