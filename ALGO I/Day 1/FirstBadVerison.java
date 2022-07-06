public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0,high = n;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid)) {
                res=mid;
                high = mid-1;
            }
            else {
                low =mid+1;
            }
        }
        return res;
    }
}