package binary_search_problems;

public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		SmallestLetterSolution s = new SmallestLetterSolution();
		char[] arr = { 'c', 'f', 'j' };
		char target = 'j';
		System.out.println(s.nextGreatestLetter(arr, target));
	}
}

class SmallestLetterSolution {
	public char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			// find the middle element
			// int mid = (start + end) / 2;
			// Problem: might be possible that (start + end) exceeds the range of int in
			// Java

			int mid = start + ((end - start) / 2);

			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return letters[start % letters.length];
	}
}
