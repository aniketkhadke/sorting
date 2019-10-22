package com.aniket.sort;

/*
 * It picks first element from unsorted sub-array and compare it with sorted sub-array and insert the smallest element where found 
 * and shift all the sorted elements from its right to the first unsorted element. 
 * It's kind of sorting playing cards in hand
 * Complexity: O(n*n)
 * */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 1000, 888, 800, 115, 600 };
		System.out.print("Input Array: ");
		printArray(arr);
		new InsertionSort().sort(arr);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}

	private void sort(int[] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {//Start from second element
			int key = arr[i];//the current value to swap is backed up
			int j = i - 1;
			while (j >= 0 && arr[j] > key) { //run till j is not zero and the value before current value is greater than current value.
				arr[j + 1] = arr[j]; //if it is, then shift values towards right
				j--;
			}
			arr[j + 1] = key;//Place the key at correct place
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("\t" + i);
		}
		System.out.println("");
	}
}
