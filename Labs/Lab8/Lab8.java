public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    
    Arrays.fill(dp, amount + 1);
    
    dp[0] = 0;
    
    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if (coin <= i) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }
    
    return dp[amount] > amount ? -1 : dp[amount];
}

// sample test case
public class CoinChangeTest {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        CoinChangeSolution solution = new CoinChangeSolution();
        int minCoins = solution.coinChange(coins, amount);

        System.out.println("Minimum coins needed: " + minCoins);
    }
}
