package com.stmt9;

import java.util.Arrays;

// Given an array of n integers and a number k, 
// find the pairs of numbers in the array such that 
// the difference between the pair is k. 
// Find the optimal solution with and without extra storage
public class Stmt9 {
	static int binarySearch(int[] arr, int low, int high, int x) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (x == arr[mid])
				return mid;
			if (x > arr[mid])
				return binarySearch(arr, (mid + 1), high, x);
			else
				return binarySearch(arr, low, (mid - 1), x);
		}
		return -1;
	}

	static int countPairsWithDiffK(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++)
			if (binarySearch(arr, i + 1, n - 1, arr[i] + k) != -1)
				count++;
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 12, 16, 4, 0, 20 };
		int k = 4;
		System.out.println("Count of pairs with given diff is " + countPairsWithDiffK(arr, k));
	}
}
