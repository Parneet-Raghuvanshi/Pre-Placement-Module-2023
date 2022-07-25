class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k==0) return 0;
        int i=0,j=0,n=nums.length,c=0,p=1;
        while (j < n) {
            p *= nums[j];
            while (i<=j && p >= k) p /= nums[i++];
            c += j-i+1;
            j++;
        }
        return c;
    }
}