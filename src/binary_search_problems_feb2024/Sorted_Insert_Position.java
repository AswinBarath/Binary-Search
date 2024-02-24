package binary_search_problems_feb2024;

public class Sorted_Insert_Position {
    public int searchInsert(int[] A, int k) {
        int n = A.length;
        int l = 0, r = n-1;
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(A[mid] == k) {
                return mid;
            } else if(A[mid] < k) {
                l = mid+1;
            } else if(A[mid] > k) {
                r = mid-1;
            }
        }
        return l;
        // Why l ? Because when we break out of loop l = mid+1, that's the required output when k is not found
    }
}
