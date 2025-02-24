class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length, n = grid[0].length,max = 0;
        int[] count = new int[1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    count[0] = 0;
                    dfs(grid, i, j, m, n, count);
                    max = Math.max(count[0], max);
                }
            }
        }
        return max;
    }

    public void dfs(int[][] grid, int i, int j, int m, int n, int[] count){
        if(i < 0 || j < 0 || i>= m || j >= n || grid[i][j] != 1) return;

        grid[i][j] = -1;
        count[0]++;
        dfs(grid, i + 1, j, m, n, count);
        dfs(grid, i - 1, j, m, n, count);
        dfs(grid, i, j + 1, m, n, count);
        dfs(grid, i, j - 1, m, n, count);
    }
}