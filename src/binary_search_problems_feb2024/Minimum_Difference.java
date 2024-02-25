package binary_search_problems_feb2024;

import java.util.Arrays;

public class Minimum_Difference {
    public int solve(int A, int B, int[][] C) {
        // Sort each row of the array
        for (int i = 0; i < C.length; i++) {
            Arrays.sort(C[i]);
        }
        // Find Min Difference
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < B; j++) {
                // Find Lower Bound: a & Upper Bound: b --> Binary Search
                int a = lower_bound(C[i + 1], C[i][j]);
                int b = a + 1;
                ans = Math.min(ans, Math.abs(C[i][j] - C[i + 1][a]));
                // Edge case -> When a is last element in the row, avoid b
                if (b < B) {
                    ans = Math.min(ans, Math.abs(C[i][j] - C[i + 1][b]));
                }
            }
        }
        return ans;
    }

    private int lower_bound(int A[], int k) {
        int l = 0, r = A.length - 1;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] <= k) {
                ans = mid;
                l = mid + 1; // Go Right
            } else {
                r = mid - 1; // Go Left
            }
        }
        return ans;
    }
}
