class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrayProduct = 1;
        int zeroCount = 0;

        for(int num: nums){
            if (num==0) zeroCount++;
            else arrayProduct*=num;
            if (zeroCount>1) return (new int[nums.length]);
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if (zeroCount==0) result[i]=arrayProduct/nums[i];
            else {
                if (nums[i]==0) result[i]=arrayProduct;
                else result[i]=0;
            }
        }
        return result;
    }
}