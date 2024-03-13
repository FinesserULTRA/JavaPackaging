import java.util.Scanner;
import utils.*;

public class Main {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\n\t\t<=Encryption Decryption =>");
        System.out.println("<========================================================>");

        System.out.print("\tEnter a 4-digit number: ");
        String number = input.nextLine();

        // Encrypt the number
        String encryptedNumber = Encrypt.encrypt(number);

        System.out.println("\tEncrypted number: " + encryptedNumber);

        // Decrypt the number
        String decryptedNumber = Decrypt.decrypt(encryptedNumber);

        System.out.println("\tDecrypted number: " + decryptedNumber);

        System.out.println("<========================================================>");
    }
}