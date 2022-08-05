class Solution {
    int max = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        // creating the base dp array, with first value set to 0
        int[] dp = new int[++amount];
        dp[0] = 0;
        // more convenient to have the coins sorted
        Arrays.sort(coins);
        // populating our dp array
        for (int i = 1; i < amount; i++) {
            // setting dp[0] base value to 1, 0 for all the rest
            dp[i] = max;
            for (int c : coins) {
                if (i - c < 0) break;
                // if it was a previously not reached cell, we do not add use it
                if (dp[i - c] != max)
                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);
            }
        }
        return dp[--amount] == max ? -1 : dp[amount];
    }
}