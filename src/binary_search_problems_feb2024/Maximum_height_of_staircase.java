package binary_search_problems_feb2024;

public class Maximum_height_of_staircase {
    public int solve(int A) {
        // Solution Idea 1:
        // Take Range 1 to A/2 and generate a Prefix Sum Array
        // Apply Binary Search on Prefix Sum Array for value <= A
        // Return index+1 as the answer (because prefix sum array is 0-indexed)

        // Edge case 1
        // if(A == 0) return 0;

        // int[] Psum = new int[A];
        // Psum[0] = 1;
        // for(int i=1; i<A; i++) {
        // Psum[i] = Psum[i-1] + (i+1);
        // }

        // System.out.println( Arrays.toString(Psum));
        int l = 0, r = A;
        long max = 0; // Edge case 2
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sum = ((long) mid * (mid + 1)) / 2; // Sum of N Natural No.s
            if (sum <= A) {
                max = Math.max(max, mid);
                l = mid + 1; // Go Right
            } else if (sum > A) {
                r = mid - 1; // Go Left
            }
            // System.out.println("sum="+sum);

        }
        return (int) max;
    }
}
