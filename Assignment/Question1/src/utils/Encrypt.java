package src.utils;

public class Encrypt {
    public static int encrypt(int number) {
        int[] digits = new int[4];
        int encryptedNumber = 0;

        // Extracting the digits of the number
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Encrypting each digit
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 7) % 10;
        }

        // Swapping the digits
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        // Constructing the encrypted number
        for (int i = 0; i < 4; i++) {
            encryptedNumber = encryptedNumber * 10 + digits[i];
        }

        return encryptedNumber;
    }
}