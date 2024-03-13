package src.utils;

public class Sieve {

    public static int[] primeFinder(int limit) {
        boolean[] isPrime = new boolean[limit];
        int[] prime = new int[limit];
        // Initialize all elements to true
        for (int i = 0; i < limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Display prime numbers
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                prime[i] = i;
            }
        }
        return prime;
    }
}