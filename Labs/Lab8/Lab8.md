For this problem, we can use dynamic programming the break down into smaller subproblems, using more space in exchange for faster compute times. We iterate through the array from various amounts based on the given target. Once reached, dp[amount] stores the answer of minimum coins needed. 