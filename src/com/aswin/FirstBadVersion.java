/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        int bad = 1;
        while(start <= end) {
            // To avoid start+end overflow
            int mid = start + (end-start)/2;
            
            if(isBadVersion(mid)) {
                bad = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return bad;
    }
}