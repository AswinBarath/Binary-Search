package sde_sheet;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		NonDupSolution soln = new NonDupSolution();
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 6, 6, 7, 7 };
		System.out.println(soln.singleNonDuplicate(arr));
	}
}

class NonDupSolution {

	public int singleNonDuplicate(int[] a) {
		if (a.length == 1)
			return a[0];
		int low = 0, high = a.length - 1;

		while (low <= high) {
			// To avoid start+end overflow
			int mid = low + (high - low) / 2;
			if (checkDuplicate(a, mid)) {
				return a[mid];
			}
			// if index is even we consider right half of the array
			if (mid + 1 < a.length && a[mid] == a[mid + 1]) {
				if (mid % 2 == 0)
					low = mid + 1;
				else
					high = mid - 1;
			}
			if (mid >= 1 && a[mid] == a[mid - 1]) {
				if (mid % 2 == 1)
					low = mid + 1;
				else
					high = mid - 1;

			}
		}
		return a[low];
	}

	public boolean checkDuplicate(int[] a, int mid) {
		if (mid == 0 && a[mid] != a[1])
			return true;
		if (mid == a.length - 1 && a[mid] != a[mid - 1])
			return true;
		if (a[mid] != a[mid + 1] && a[mid] != a[mid - 1])
			return true;
		return false;
	}
}