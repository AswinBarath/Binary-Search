package binary_search_problems_feb2024;

public class MatrixSearch {
    public int searchMatrix(int[][] A, int target) {
        int N = A.length, M = A[0].length;
        // int l = 0, r = (N-1)+(M-1); -> Mistake
        int l = 0, r = (N * M) - 1;
        while(l <= r) {
            // Hint 2: Use the formulas: row = int(mid / n) and col = int(mid % n).
            // int size = N*M; // Total size of flatten array from matrix
            int mid = l + (r - l) / 2;            
            int row = (int)(mid / M), col = (int)(mid % M);
            if(A[row][col] == target) {
                return 1; // Found
            } else if(A[row][col] < target) {
                l = mid + 1; // Go Right
            } else { 
                // A[row][col] > target
                r = mid - 1; // Go Left
            }
            // System.out.println("mid=" + mid + ", A[row][col]" + A[row][col]);
        }
        return 0; // Not Found
    }
}
