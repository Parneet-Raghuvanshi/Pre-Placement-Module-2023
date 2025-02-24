class Solution {
    public int findMin(int[] nums) {
        int l = 0,r=nums.length-1,n=nums.length;
        int mid,prev,next;
        while(l<=r){
            mid = l + (r-l)/2;
            prev = (mid + n - 1)%n;
            next = (mid+1)%n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next])
                return nums[mid];
            else if(nums[mid]>nums[r])
                l = mid+1;
            else
                r = mid-1;
        }
        return -1;
    }
}