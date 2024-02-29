package binary_search_on_answer;

// Problem Statement (in-short):
// Minimize: Sum <= B for Maximized: K 
// Sum -> sum of a subarray of size K
// // ans = K <= (subarray of size K: w/ sum <= B) <= (no subarray in A of size K: w/ the sum > B)

public class Special_Integer {
    public int solve(int[] A, int B) {
        int N = A.length;
        // Search space
        int left = 0; // least size of array
        int right = N; // size of array
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // mid => Size of subarrays
            boolean K = checkSubarraySum(A, mid, B);
            if (K == true) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;
    }

    boolean checkSubarraySum(int[] A, int size, int maxSum) {
        // Sliding Window Technique
        int n = A.length;
        int count = 0;
        long sum = 0;
        int lastX = A[0], x = 0;
        for (int i = 0; i < n; i++) {
            if (count < size) {
                sum += A[i];
                count++;
            }
            if (count == size) {
                if (sum > maxSum)
                    return false;
                count--;
                sum -= lastX;
                if ((x + 1) < n)
                    lastX = A[++x];
            }
            // Debugging
            // System.out.println("count="+count+", sum="+sum + ", lastX="+lastX+", x="+x);
        }
        return true;
    }
}

/*
 * Problem Description
 * Given an array of integers A and an integer B, find and return the maximum
 * value K such that there is no subarray in A of size K with the sum of
 * elements greater than B.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 100000
 * 1 <= A[i] <= 10^9
 * 1 <= B <= 10^9
 * 
 * 
 * 
 * Input Format
 * The first argument given is the integer array A.
 * 
 * The second argument given is integer B.
 * 
 * 
 * 
 * Output Format
 * Return the maximum value of K (sub array length).
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 3, 4, 5]
 * B = 10
 * Input 2:
 * 
 * A = [5, 17, 100, 11]
 * B = 130
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 3
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * For K = 5, There are subarrays [1, 2, 3, 4, 5] which has a sum > B
 * For K = 4, There are subarrays [1, 2, 3, 4], [2, 3, 4, 5] which has a sum > B
 * For K = 3, There is a subarray [3, 4, 5] which has a sum > B
 * For K = 2, There were no subarray which has a sum > B.
 * Constraints are satisfied for maximal value of 2.
 * Explanation 2:
 * 
 * For K = 4, There are subarrays [5, 17, 100, 11] which has a sum > B
 * For K = 3, There were no subarray which has a sum > B.
 * Constraints are satisfied for maximal value of 3.
 */