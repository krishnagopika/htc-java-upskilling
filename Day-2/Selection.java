package com.sort.search;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        selectionSort(arr);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	}

}
