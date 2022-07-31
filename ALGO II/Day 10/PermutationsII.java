class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[]visited = new boolean[nums.length];
        Arrays.sort(nums);
        permutations(nums,visited,res,new ArrayList<>());
        return res;
    }

    public void permutations(int []nums , boolean[]visited , List<List<Integer>> res,List<Integer>ans) {

        if(ans.size() == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0; i<nums.length; i++) {
            if(visited[i] == false) {
                if(i > 0 && nums[i-1] == nums[i] && !visited[i-1]) continue;
                visited[i] = true;
                ans.add(nums[i]);

                permutations(nums,visited,res,ans);

                ans.remove(ans.size()-1);
                visited[i] = false;
            }
        }
    }
}