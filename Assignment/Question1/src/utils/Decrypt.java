package src.utils;

public class Decrypt {
    static String decryptedNumber;

    public static String decrypt(String encryptedNumber) {

        // Convert the string to a character array
        char digits[] = encryptedNumber.toCharArray();

        // Swap the digits back to their original positions
        char temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        // Replace each digit with the result of subtracting 7 from the digit and
        // getting the remainder after dividing the new value by 10
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) ((digits[i] - '0' - 7 + 10) % 10 + '0');
        }

        // Convert the modified string back to an integer
        decryptedNumber = String.valueOf(digits);

        return decryptedNumber;
    }
}
