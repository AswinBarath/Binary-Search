package binary_search_problems_feb2024;

public class FindPeakElement {
    public int solve(int[] A) {
        int n = A.length;
        int l = 0, r = n - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if( safeGet(A, mid) > safeGet(A, mid-1) && 
                safeGet(A, mid) > safeGet(A, mid+1) ) {
                return A[mid];
            }
            else if( safeGet(A, mid) > safeGet(A, mid-1) && 
                     safeGet(A, mid) <= safeGet(A, mid+1) ) {
                l = mid + 1;
            }
            else if( safeGet(A, mid) <= safeGet(A, mid-1) && 
                     safeGet(A, mid) > safeGet(A, mid+1) ) {
                r = mid - 1;
            }
        }
        return A[mid];
    }
    private int safeGet(int[] A, int i) {
        if(0 <= i && i < A.length) {
            return A[i];
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
