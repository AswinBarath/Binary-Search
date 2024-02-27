package binary_search_problems_feb2024;

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
