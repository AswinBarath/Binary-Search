package template_II;

// Problem: https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {

	static int findInMountainArray(int target, MountainArray mountainArr) {
		int arr[] = new int[mountainArr.length()];
		for (int i = 0; i < mountainArr.length(); i++) {
			arr[i] = mountainArr.get(i);
		}
		return search(arr, target);
	}

	static int search(int[] arr, int target) {
		int peak = findPeakElement(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		// try to search in second half
		return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
	}

	static int findPeakElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + ((end - start) / 2);

			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return end;
	}

	static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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

	public static void main(String[] args) {

		MountainArray arr = new MountainArray(10);
		int target = 7;

		int num = 5;
		for (int i = 0; i < 10; i++) {
			arr.put(num, i);
			if (i < 5) {
				num++;
			}
			if (i >= 5) {
				num--;
			}
		}
		System.out.println(findInMountainArray(target, arr));

	}

}

/**
 * // This is MountainArray's API interface. // You should not implement it, or
 * speculate about its implementation interface MountainArray { public int
 * get(int index) {} public int length() {} }
 */

class MountainArray {
	int[] arr = null;
	int size = 0;

	public MountainArray(int size) {
		arr = new int[size];
		this.size = size;
	}

	public int length() {
		return arr.length;
	}

	public int get(int i) {
		return arr[i];
	}

	public void put(int ele, int i) {
		if (i < 0 || i >= this.size) {
			return;
		}
		arr[i] = ele;
	}
}
