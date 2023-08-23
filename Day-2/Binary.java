package com.sort.search;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {11, 12, 22, 25, 34, 64, 90};
	        int searchElement = 22;
	        
	        int index = binarySearch(arr, searchElement);
	        
	        if (index != -1) {
	            System.out.println("Element " + searchElement + " found at index " + index);
	        } else {
	            System.out.println("Element " + searchElement + " not found in the array.");
	        }
	    }

	    static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (arr[mid] == target) {
	                return mid; // Element found, return its index
	            } else if (arr[mid] < target) {
	                left = mid + 1; // Search the right half
	            } else {
	                right = mid - 1; // Search the left half
	            }
	        }
	        
	        return -1; // Element not found
	}

}
