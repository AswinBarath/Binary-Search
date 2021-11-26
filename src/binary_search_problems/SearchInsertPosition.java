package binary_search_problems;

// Literally same as Ceiling Of A Number

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 9, 14, 16, 18 };
		int target = 15;
		int ans = searchInsert(arr, target);
		System.out.println(ans); // answer is 6
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return start;
	}
}
