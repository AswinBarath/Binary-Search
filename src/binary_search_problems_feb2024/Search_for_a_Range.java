package binary_search_problems_feb2024;

public class Search_for_a_Range {
	
	public int[] searchRange(final int[] A, int k) {
        // int[] ans = new int[2];
        int[] ans = {-1, -1};
        int n = A.length;
        // First Occurance
        int l = 0, r = n-1;
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(A[mid] == k) {
                ans[0] = mid;
                r = mid-1;
            } else if(A[mid] < k) {
                l = mid+1;
            } else if(A[mid] > k) {
                r = mid-1;
            }
        }
        // Last Occurance
        l = 0; r = n-1;
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(A[mid] == k) {
                ans[1] = mid;
                l = mid+1;
            } else if(A[mid] < k) {
                l = mid+1;
            } else if(A[mid] > k) {
                r = mid-1;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
