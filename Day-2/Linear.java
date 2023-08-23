package com.sort.search;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int searchElement = 22;
        
        int index = linearSearch(arr, searchElement);
        
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
	}

}
