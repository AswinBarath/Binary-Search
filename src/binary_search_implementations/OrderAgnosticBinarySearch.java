package binary_search_implementations;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int[] arr = { 99, 55, 22, 11, 10, 3, 1 };
		int target = 10;
		int ans = orderAgnosticBS(arr, target);
		System.out.println(ans);
	}

	// return the index
	// return -1 if it does not exist
	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// find whether the array is sorted in ascending or descending
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			// find the middle element
			// int mid = (start + end) / 2;
			// Problem: might be possible that (start + end) exceeds the range of int in
			// Java

			int mid = start + ((end - start) / 2);

			if (arr[mid] == target) {
				// ans found
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}

		return -1;
	}
}
