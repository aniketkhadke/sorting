package com.aniket.sort;

/*
 * Bubble sort works by swapping two adjacent elements if they are not in order
 * Best Case Complexity: O(n) - When the array is already sorted
 * Worst Case Complexity: O(n*n) - When all n-1 iterations are required for sorting
 * */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 100, 19, 22, 115, 600 };
		System.out.print("Input Array: ");
		printArray(arr);
		new BubbleSort().bubbleSort(arr);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}

	private void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				//if (arr[j] < arr[j + 1]) {//Descending order
				if (arr[j] > arr[j + 1]) { //Ascending order
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			/*If no value is not swapped then, it means the array is already sorted.
			So break the outer loop.*/
			if (!swapped) {
				break;
			}
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("\t" + i);
		}
		System.out.println("");
	}
}
