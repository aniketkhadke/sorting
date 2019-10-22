package com.aniket.sort;

/* Quick sort will take one element as pivot. In below example it is last element. (You can take any)
 * Partitions the array in such a way that all elements to left are smaller than pivot and greater elements are placed at right.
 * In short, we place the pivot element at it's correct position
 * Worst case: O(n*n) When pivot is always largest or smallest number
 * Best case: O(n log2 n) When middle element is picked as pivot
 * 
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 1000, 888, 800, 115, 600, 215, 117, 700 };
		System.out.print("Input Array: ");
		printArray(arr);
		new QuickSort().sort(arr, 0, arr.length - 1);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be
	 * sorted, low --> Starting index, high --> Ending index
	 */
	void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("\t" + i);
		}
		System.out.println("");
	}

	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		printArray(arr);
		return i + 1;
	}

}
