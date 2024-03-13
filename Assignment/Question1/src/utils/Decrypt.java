package src.utils;

public class Decrypt {
    public static int decrypt(int number) {
        int[] digits = new int[4];
        int decryptedNumber = 0;

        // Extracting the digits of the number
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Swapping the digits back to their original positions
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        // Decrypting each digit
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 3) % 10;
        }

        // Constructing the decrypted number
        for (int i = 0; i < 4; i++) {
            decryptedNumber = decryptedNumber * 10 + digits[i];
        }

        return decryptedNumber;
    }
}