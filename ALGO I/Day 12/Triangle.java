class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
	    int[][] dp = new int[n+1][n+1];

	    for (int level=n-1; level>=0; level--) {
            for (int i=0; i<=level; i++) {
                int min = Math.min(dp[level+1][i], dp[level+1][i+1]);
                dp[level][i] = triangle.get(level).get(i) + min;
            }
        }
	    return dp[0][0];
    }
}