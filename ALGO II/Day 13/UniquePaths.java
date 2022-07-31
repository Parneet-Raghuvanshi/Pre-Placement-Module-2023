class Solution {
    public int uniquePaths(int m, int n) {
        // TLE in this above code part!
        // if (m == 1 || n == 1) return 1;
        // int bottom = uniquePaths(m-1,n);
        // int right = uniquePaths(m,n-1);
        // return bottom + right;
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }
}