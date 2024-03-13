import utils.Sieve;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t<=Sieve of Eratosthenes=>");
        System.out.println("<==========================================>\n\n");

        int limit = 10000;

        int[] prime = Sieve.main(args, limit);

        System.out.println("Prime numbers between 1 and " + limit + " are: \n");

        int count = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 0) {
                continue;
            }
            System.out.printf("%03d\t", prime[i]);
            count++;
            if (count % 3 == 0) {
                System.out.println('\n');
            }
        }

        System.out.println("\n\n<==========================================>");
    }
}