class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        solve(list, new ArrayList<>(), nums);
        return list;
    }

    public void solve(List<List<Integer>> res, List<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++) {
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                solve(res, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}