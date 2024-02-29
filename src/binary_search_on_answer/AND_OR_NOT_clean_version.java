package binary_search_on_answer;

import java.util.Arrays;

public class AND_OR_NOT_clean_version {
    public int[] solve(int[] A, int B) {
        int[] ans = new int[2];
        Arrays.sort(A);
        long psum[] = new long[A.length];
        psum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            psum[i] = psum[i - 1] + A[i];
        }
        for (int i = 0; i < A.length; i++) {
            int max = 0;
            int lo = 1;
            int hi = i + 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                long cost = 1L * A[i] * mid;
                long sum = psum[i];
                if (mid <= i)
                    sum = psum[i] - psum[i - mid];
                long no_of_operations = cost - sum;
                if (no_of_operations <= B) {
                    max = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            if (max > ans[0]) {
                ans[0] = max;
                ans[1] = A[i];
            }
        }
        return ans;
    }
}

/*
 * Problem Description
 * Given an array of integers A of size N and an integer B.
 * 
 * In a single operation, any one element of the array can be increased by 1.
 * You are allowed to do at most B such operations.
 * 
 * Find the number with the maximum number of occurrences and return an array C
 * of size 2, where C[0] is the number of occurrences, and C[1] is the number
 * with maximum occurrence.
 * If there are several such numbers, your task is to find the minimum one.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 
 * -109 <= A[i] <= 109
 * 
 * 0 <= B <= 109
 * 
 * 
 * 
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * 
 * 
 * 
 * Output Format
 * Return an array C of size 2, where C[0] is number of occurence and C[1] is
 * the number with maximum occurence.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [3, 1, 2, 2, 1]
 * B = 3
 * Input 2:
 * 
 * A = [5, 5, 5]
 * B = 3
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [4, 2]
 * Output 2:
 * 
 * [3, 5]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Apply operations on A[2] and A[4]
 * A = [3, 2, 2, 2, 2]
 * Maximum occurence = 4
 * Minimum value of element with maximum occurence = 2
 * Explanation 2:
 * 
 * A = [5, 5, 5]
 * Maximum occurence = 3
 * Minimum value of element with maximum occurence = 5
 * 
 */
