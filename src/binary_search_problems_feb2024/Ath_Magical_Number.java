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

/*
 * Problem Description
 * You are given three positive integers, A, B, and C.
 * 
 * Any positive integer is magical if divisible by either B or C.
 * 
 * Return the Ath smallest magical number. Since the answer may be very large,
 * return modulo 109 + 7.
 * 
 * Note: Ensure to prevent integer overflow while calculating.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A <= 109
 * 
 * 2 <= B, C <= 40000
 * 
 * 
 * 
 * Input Format
 * The first argument given is an integer A.
 * 
 * The second argument given is an integer B.
 * 
 * The third argument given is an integer C.
 * 
 * 
 * 
 * Output Format
 * Return the Ath smallest magical number. Since the answer may be very large,
 * return modulo 109 + 7.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = 1
 * B = 2
 * C = 3
 * Input 2:
 * 
 * A = 4
 * B = 2
 * C = 3
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 6
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * 1st magical number is 2.
 * Explanation 2:
 * 
 * First four magical numbers are 2, 3, 4, 6 so the 4th magical number is 6.
 */