class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color != newColor)
            dfs(image, sr, sc, newColor, color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int newColor, int orignal){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != orignal)
            return;
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, newColor, orignal);
        dfs(image, sr - 1, sc, newColor, orignal);
        dfs(image, sr, sc + 1, newColor, orignal);
        dfs(image, sr, sc - 1, newColor, orignal);
    }
}