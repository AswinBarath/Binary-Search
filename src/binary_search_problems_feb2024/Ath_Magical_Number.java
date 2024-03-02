package binary_search_problems_feb2024;

public class Ath_Magical_Number {
    public int solve(int A, int B, int C) {
        long mod = 1000000007, ans = 0;
        long low = Math.min(B, C), high = 1L * A * Math.min(B, C);
        // GCD => n1
        int n1 = B, n2 = C;
        while (n2 > 0) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp % n2;
        }
        long lcm = 1L * B * C / n1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long check = 1L * ((mid / B) + (mid / C) - (mid / lcm));
            if (check >= A) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return (int) (ans % mod);
    }
}
