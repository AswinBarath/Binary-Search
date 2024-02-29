package binary_search_on_answer;

public class Painters_Partition_Problem {
    public int paint(int A, int B, int[] C) {
        int n = C.length;
        long left = 0; // max(C)
        long right = 0; // sum(C)
        for (int i = 0; i < n; i++) {
            if (C[i] > left)
                left = C[i];
            right += C[i];
        }
        long ans = -1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            // mid = TimeLimit
            long timeLimit = 1L * mid * B;
            int painters = countPainters(C, B, timeLimit);
            if (painters <= A) {
                ans = timeLimit;
                // Go Left -> why? To minimize TimeLimit (ans = min(mid * B))
                right = mid - 1;
            } else {
                // Go Right
                left = mid + 1;
            }
            // Debugging
            // System.out.println(ans);
        }
        long mod = 10000003;
        return (int) (ans % mod);
    }

    private int countPainters(int[] c, int B, long timeLimit) {
        int n = c.length;
        int painters = 1;
        long time = 0;
        for (int i = 0; i < n; i++) {
            time += (1L * c[i] * B);
            if (time > timeLimit) {
                painters++;
                time = 1L * c[i] * B;
            }
        }
        return painters;
    }
}
