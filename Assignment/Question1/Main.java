import src.utils.*;
import java.util.Scanner;

public class Main {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\n\t<=Encryption Decryption =>");
        System.out.println("<==========================================>");

        System.out.print("Enter a 4-digit number: ");
        String number = input.nextLine();

        // Encrypt the number
        String encryptedNumber = Encrypt.encrypt(number);

        System.out.println("Encrypted number: " + encryptedNumber);

        // Decrypt the number
        String decryptedNumber = Decrypt.decrypt(encryptedNumber);

        System.out.println("Decrypted number: " + decryptedNumber);

        input.close();

        System.out.println("<==========================================>");
    }
}