package src.utils;

public class Encrypt {

    public static String encrypt(String number) {
        
        if (number == null || number.length() != 4 || !number.matches("\\d+")) {
            throw new IllegalArgumentException("Number should be a 4-digit positive integer.");
        }

        char digits[] = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) ((digits[i] - '0' + 7) % 10 + '0');
        }

        char temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        String encryptedNumber = String.valueOf(digits);

        return encryptedNumber;
    }

}