class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = Arrays.stream(candidates).boxed().collect(Collectors.toList());
        List<Integer> sol = new ArrayList<>();
        List<List<Integer>> solution = new ArrayList<>();
        solve(list,target,0,0,sol,solution);
        return solution;
    }

    static void solve(List<Integer> list,int target,int sum,int index,List<Integer> sol,List<List<Integer>> solution) {
        if (sum >= target || index>=list.size()) {
            if (sum == target) solution.add(sol);
            return;
        }
        List<Integer> sol1 = new ArrayList<>(sol);
        List<Integer> sol2 = new ArrayList<>(sol);
        int sum1 = sum + list.get(index);
        sol1.add(list.get(index));
        solve(list,target,sum1,index,sol1,solution);
        solve(list,target,sum,index+1,sol2,solution);
    }
}