class Solution {
    // Dynaminc Programming
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int i = 0; i < l1; ++i)
            for (int j = 0; j < l2; ++j)
                if (word1.charAt(i) == word2.charAt(j))
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                else
                    dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
        // Only this line changed from Basic LCS
        return l1+l2 - (2*dp[l1][l2]);
    }
}