package binary_search_problems_feb2024;

import java.util.Arrays;

public class AND_OR_NOT {
    public int[] solve(int[] A, int B) {
        // Create Answer array:
        // A[0] => Maximum No. of Occurances in A[n] (of A[1]);
        // A[1] = The minimum value in A[n] with A[0] occurances
        int[] ans = new int[2];
        ans[0] = 0; // Intialize with zero
        ans[1] = Integer.MAX_VALUE; // Intialize with int_max
        // Step 1: Sort the array
        Arrays.sort(A);
        // Step 2: Create Prefix array
        // -> why? -> use sum to find operations
        long psum[] = new long[A.length];
        psum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            psum[i] = psum[i - 1] + A[i];
        }
        // Step 3: Linear Search on array
        // -> to minimize: array value with max occurrences
        for (int i = 0; i < A.length; i++) {
            int max = 0;
            // Binary search: No. of operations possible
            // Here the target = B
            // 1. Search Space
            int lo = 1;
            int hi = i + 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                // Formula: no_of_operations_required = (current element * operations) - (Prefix
                // Sum of elements)
                long cost = 1L * A[i] * mid;
                long sum = psum[i]; // Prefix Sum Calc when i==0
                if (mid <= i)
                    sum = psum[i] - psum[i - mid]; // Prefix Sum Calc
                long no_of_operations = cost - sum;
                // 2. If mid is ans
                if (no_of_operations <= B) {
                    // Keep track of Max occurrences -> to maximize occurrences
                    max = mid;
                    // Go Right => Increase No. of operations
                    lo = mid + 1;
                } else {
                    // means: no_of_operations > B
                    // Go Left => Decrease No. of operations
                    hi = mid - 1;
                }
            }
            // Keep track of Min Value w/ Max occurrences
            // if(temp[1] < ans[1] && temp[0] >= ans[0]) {
            if (max > ans[0]) {
                ans[0] = max;
                ans[1] = A[i];
            }
        }
        return ans;
    }
}

/*
 * Hint: When to use Binary Search?
 * - If you sort the array and it won't affect the answer
 * - To Maximize the Answer
 * - For example: To find Maximum number of occurrences
 * - To Minimize the Answer
 * - To both Maximize & Minimize the Answer
 */

/*
 * Problem Description (in-short: according to my understanding):
 * Given: A[n], B (at max B:(+1)_increment_operations allowed)
 * Find: Ans = {X, Y}
 * X = Maximum No. of Occurances in A[n] (of Y)
 * Y = The minimum value in A[n] with X occurances
 */

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