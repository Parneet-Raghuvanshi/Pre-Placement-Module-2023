class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        combine(combinations, new ArrayList<Integer>(), 1, n, k);
        return combinations;
    }

    void combine(List<List<Integer>> combinations, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combinations.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combinations, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }
}