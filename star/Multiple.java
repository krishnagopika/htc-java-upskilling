package com.htc;
import java.util.*;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        if (size > 0) {
	            int firstElement = arr[0];
	            System.out.print("Multiples of " + firstElement + " in the array: ");
	            for (int num : arr) {
	                if (num % firstElement == 0) {
	                    System.out.print(num + " ");
	                }
	            }
	        } else {
	            System.out.println("Array is empty.");
	        }

	        scanner.close();
	}

}
