package com.htc;
import java.util.*;
public class StringEncrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the encrypted string:");
        String encryptedString = scanner.nextLine();

        System.out.println("Enter the key value:");
        int key = Integer.parseInt(scanner.nextLine());

        String decryptedString = decrypt(encryptedString, key);
        System.out.println("Decrypted message: " + decryptedString);
    }

    public static String decrypt(String encryptedString, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encryptedString.length(); i++) {
            char currentChar = encryptedString.charAt(i);
            if (Character.isLetter(currentChar)) {
                char decryptedChar = (char) (currentChar - key);
                if (Character.isLowerCase(currentChar)) {
                    if (decryptedChar < 'a') {
                        decryptedChar = (char) ('z' - ('a' - decryptedChar) + 1);
                    }
                } else if (Character.isUpperCase(currentChar)) {
                    if (decryptedChar < 'A') {
                        decryptedChar = (char) ('Z' - ('A' - decryptedChar) + 1);
                    }
                }
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(currentChar);
            }
        }

        return decrypted.toString();
	}

}
