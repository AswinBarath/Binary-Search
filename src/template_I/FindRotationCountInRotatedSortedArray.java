package template_I;

public class FindRotationCountInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 5, 6, 7, 1, 2, 3, 4, 4 };
		FindRotation soln = new FindRotation();
		System.out.println(soln.findRotation(arr));
	}
}

class FindRotation {
	public int findRotation(int[] nums) {

		int pivot = findPivot(nums);
		return pivot + 1;

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
