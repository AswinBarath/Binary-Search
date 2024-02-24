public class Solution {
    public int solve(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(safeGet(A, mid) != safeGet(A, mid+1) && safeGet(A, mid) != safeGet(A, mid-1)) {
                return safeGet(A, mid);
            }
            if(safeGet(A, mid) == safeGet(A, mid-1)) {
                mid = mid - 1;
            }
            if(mid % 2 == 0) {
                l = mid + 2;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
    int safeGet(int[] A, int i) {
        if(0 <= i && i < A.length) {
            return A[i];
        } else {
            return Integer.MAX_VALUE;
        }
    }
}
