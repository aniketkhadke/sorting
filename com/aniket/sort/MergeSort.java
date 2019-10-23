package com.aniket.sort;

/* Merge sort works in didivde and concour 
 * Divide the array in middle, keep going deep down the tree until array can be divided. 
 * And then start merging with sorting 
 * Worst, Best and Average case complexity: O(nLogn) 
 * 
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1000, 888, 800, 115, 600, 215, 117, 700 };
		System.out.print("Input Array: ");
		printArray(arr);
		new MergeSort().sort(arr, arr.length);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}

	/*
	 * Low --> Starting index, high --> Ending index
	 */
	void sort(int arr[], int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = arr[i];
		}
		sort(l, mid);
		sort(r, n - mid);

		merge(arr, l, r, mid, n - mid);
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("\t" + i);
		}
		System.out.println("");
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

}
