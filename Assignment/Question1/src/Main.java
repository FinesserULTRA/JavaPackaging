import java.util.Scanner;
import utils.Cryptography;

public class Main {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Test class for Cryptography
        System.out.println("\n\n\t\t<=Encryption Decryption =>");
        System.out.println("<========================================================>");

        System.out.print("\tEnter a 4-digit number: ");
        String number = input.nextLine();

        // Encrypt the number
        String encryptedNumber = Cryptography.encrypt(number);

        System.out.println("\tEncrypted number: " + encryptedNumber);

        // Decrypt the number
        String decryptedNumber = Cryptography.decrypt(encryptedNumber);

        System.out.println("\tDecrypted number: " + decryptedNumber);

        System.out.println("<========================================================>");
    }
}