package com.htc;
import java.util.*;
public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        System.out.print("Enter email ID: ");
        String email = s.nextLine();

        String[] parts = email.split("[.@]");
        
        if (parts.length >= 3) {
            String firstName = parts[0];
            String lastName = parts[1];

            if (!firstName.isEmpty() && !lastName.isEmpty()) {
                char firstInitial = Character.toUpperCase(firstName.charAt(0));
                char lastInitial = Character.toUpperCase(lastName.charAt(0));

                System.out.println("Output: " + firstInitial + lastInitial);
            } else {
                System.out.println("Invalid email format");
            }
        } else {
            System.out.println("Invalid email format");
        }

        s.close();

	}

}
