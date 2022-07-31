class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = Arrays.stream(candidates).boxed().collect(Collectors.toList());
        Collections.sort(list);
        List<Integer> sol = new ArrayList<>();
        List<List<Integer>> solution = new ArrayList<>();
        solve(list,target,0,0,sol,solution);
        return solution;
    }

    static void solve(List<Integer> input,int target,int sum,int index,List<Integer> output,List<List<Integer>> solution) {
        if (sum >= target || index>= input.size()){
            if (sum == target) {
                solution.add(output);
            }
            return;
        }
        for (int i=index;i<input.size();i++){
            if (i==index || !input.get(i-1).equals(input.get(i))) {
                List<Integer> newOutput = new ArrayList<>(output);
                newOutput.add(input.get(i));
                int sumNew = sum + input.get(i);
                solve(input,target,sumNew,i+1,newOutput,solution);
            }
        }
    }
}