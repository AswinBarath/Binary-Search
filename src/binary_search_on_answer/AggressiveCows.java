package binary_search_on_answer;

import java.util.Arrays;

public class AggressiveCows {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int left = 1;
        int right = A[n - 1] - A[0]; // Max distance
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // mid -> min. distance b/w 2 cows
            int cows = mooCounter(A, mid);
            if (cows >= B) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    int mooCounter(int[] A, int minDist) {
        // code
        int n = A.length;
        int cows = 1;
        int lastX = A[0];
        for (int i = 1; i < n; i++) {
            if ((A[i] - lastX) >= minDist) {
                cows++;
                lastX = A[i];
            }
        }
        return cows;
    }
}
