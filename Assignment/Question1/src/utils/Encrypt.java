package src.utils;

public class Encrypt {
    static String encryptedNumber;

    public static String encrypt(String number) {
        char digits[] = number.toCharArray();

        // Check if the digits array is empty
        if (digits.length == 0) {
            return "";
        }

        // Replace each digit with the result of adding 7 to the digit and getting the
        // remainder after dividing the new value by 10
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) ((digits[i] - '0' + 7) % 10 + '0');
        }

        // Swap the digits
        char temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        // Convert the modified string back to an integer
        encryptedNumber = String.valueOf(digits);

        return encryptedNumber;
    }

    public String getNumber() {
        return encryptedNumber;
    }
}