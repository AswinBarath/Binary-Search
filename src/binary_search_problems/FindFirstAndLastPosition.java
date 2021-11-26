package binary_search_problems;

public class FindFirstAndLastPosition {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		FandLSolution soln = new FandLSolution();
		int[] ans = soln.searchRange(nums, target);
		for (int num : ans) {
			System.out.println(num);
		}
	}
}

class FandLSolution {
	public int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		// check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}

		return ans;
	}

	// this function just returns the index value of target
	int search(int[] nums, int target, boolean findStartIndex) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;

		// check for first occurrence if target first
		while (start <= end) {
			// Prevent (left + right) overflow
			int mid = start + ((end - start) / 2);

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential answer found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}
}
