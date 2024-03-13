package src.utils;

public class Sieve {

    public static int[] primeFinder() {
        boolean[] isPrime = new boolean[1000];
        int[] prime = new int[1000];
        // Initialize all elements to true
        for (int i = 0; i < 1000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Display prime numbers
        for (int i = 2; i < 1000; i++) {
            if (isPrime[i]) {
                prime[i] = i;
            }
        }
        return prime;
    }
}