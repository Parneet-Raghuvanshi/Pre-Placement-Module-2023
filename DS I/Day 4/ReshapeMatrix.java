class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if((rows * cols) != (r * c)) return mat;

        int[][] res = new int[r][c];
        int new_rows = 0;
        int new_cols = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                res[new_rows][new_cols] = mat[i][j];
                new_cols++;
                if(new_cols == c) {
                    new_cols = 0;
                    new_rows++;
                }
            }
        }

        return res;
    }
}