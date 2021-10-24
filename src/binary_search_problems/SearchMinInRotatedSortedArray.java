package template_I;

public class SearchMinInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 3 };
		SearchMinSolution soln = new SearchMinSolution();
		System.out.println(soln.findMin(arr));
	}
}

class SearchMinSolution {
	public int findMin(int[] nums) {
		int pivot = findPivot(nums);
		// if you did not find a pivot, it means the array is not rotated
		if (pivot == -1) {
			return nums[0];
		}
		// if pivot is found, you have found 2 asc sorted arrays
		if (nums[pivot] > nums[pivot + 1]) {
			return nums[pivot + 1];
		}
		// if you did not find a pivot, it means the array is not rotated
		return nums[0];
	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + ((end - start) / 2);
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
