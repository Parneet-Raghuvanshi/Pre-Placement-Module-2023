class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null) return -1;
        int low = 0,high = nums.length-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}