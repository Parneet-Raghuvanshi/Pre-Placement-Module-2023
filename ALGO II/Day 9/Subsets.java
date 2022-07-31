class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> input = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> solution = new ArrayList<>();
        solve(input,output,solution);
        return solution;
    }

    public static void solve(List<Integer> input,List<Integer> output,List<List<Integer>> solution){
        if (input.size()==0){
            solution.add(output);
            return;
        }
        List<Integer> out1 = new ArrayList<>(output);
        List<Integer> out2 = new ArrayList<>(output);
        out2.add(input.get(0));
        input.remove(0);
        solve(new ArrayList<>(input),out1,solution);
        solve(new ArrayList<>(input),out2,solution);
    }
}