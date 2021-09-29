package template_II;

// Problem 1: https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Problem 2: https://leetcode.com/problems/find-peak-element/
// Solution is literally the same for both problems

public class PeakIndexinMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 7, 6, 3, 0 };
		int ansIdx = peekIndexInMountainArray(arr);
		System.out.println("Index=" + ansIdx + ", arr[idx]=" + arr[ansIdx]);
	}

	static int peekIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// Prevent (left + right) overflow
			int mid = start + ((end - start) / 2);

			if (arr[mid] < arr[mid + 1]) {
				// You're in ascending part
				start = mid + 1;
				// because we know that mid+1 element > mid element
			} else {
				// You're in dec part of the array
				// this may be an ans, but look at left
				// this is why end is not mid - 1
				end = mid;
			}
		}

		return end;
	}

}
