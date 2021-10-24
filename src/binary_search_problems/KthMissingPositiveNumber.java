package template_II;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {

		FindKthPositiveSolution soln = new FindKthPositiveSolution();
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		soln.findKthPositive(arr, k);
	}

}

class FindKthPositiveSolution {
	public int findKthPositive(int[] arr, int k) {
		int l = 0, r = arr.length, m;
		while (l < r) {
			m = (l + r) / 2;
			if (arr[m] - 1 - m < k)
				l = m + 1;
			else
				r = m;
		}
		return l + k;
	}
}

/*
 * Approach: [2,3,4,7,11], k = 5
 * 
 * the number of missing under A[m] is A[m] - 1 - m.
 * 
 * If A[m] - 1 - m < k, m is too small, we update left = m. If A[m] - 1 - m >=
 * k, m is big enough, we update right = m.
 * 
 * 
 */
