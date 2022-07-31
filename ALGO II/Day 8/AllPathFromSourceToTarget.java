class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> tmp = new ArrayList<>();
        dfs(graph, 0, tmp);
        return ans;
    }

    public void dfs(int[][] graph, int a, List<Integer> tmp) {
        tmp.add(a);
        if(a == graph.length-1) {
            ans.add(new ArrayList<Integer>(tmp));
        }
        for(int c : graph[a]) {
            dfs(graph, c, tmp);
            tmp.remove(tmp.size()-1);
        }
        return;
    }
}