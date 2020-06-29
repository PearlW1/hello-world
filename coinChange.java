import java.util.Arrays;

public class coinChange {
	int miniAns;
	public int coinChange(int[] coins, int amount) {
		if (amount == 0) return 0;
		Arrays.sort(coins);
		miniAns = Integer.MAX_VALUE;
		coinChangeL(coins, amount, coins.length - 1, 0);
		miniAns = miniAns == Integer.MAX_VALUE? -1: miniAns;
		return miniAns;
	}

	public void coinChangeL(int[] coins, int amount, int index, int cnt) {
		if (amount == 0) {
			miniAns = Math.min(cnt, miniAns);
			return;
		}
		if (index < 0 || amount < 0) {
			return;
		}

		for (int maxcoin = amount/coins[index]; maxcoin >= 0 && maxcoin + cnt < miniAns; maxcoin--) {
			coinChangeL(coins, amount - maxcoin * coins[index], index - 1, cnt + maxcoin);
		}
	}


	public int coinChangeA(int[] coins, int amount) {
			int max = amount + 1;
			//dp[i] 表示amount = i时，需要的硬币数量
			int[] dp = new int[amount + 1];//dp[0] 到 dp[amount]
			//填充dp[],因为dp[]最大为amount个，所以将其初始化为amount+1
			Arrays.fill(dp, max);
			dp[0] = 0;
			for (int i = 1; i <= amount; i++) {
				for (int j = 0; j < coins.length; j++) {
					if (coins[j] <= i) {
						dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
					}
				}
			}
			return dp[amount] > amount ? -1 : dp[amount];
	}



	public int change(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int coin : coins) {
			for (int x = coin; x < amount + 1; ++x) {
				dp[x] += dp[x - coin];
			}
		}
		return dp[amount];
	}

	public static void main(String[] args) {

		coinChange obj = new coinChange();
		int[] coins = {1, 2, 5};
		int amount = 11;
		int res = obj.change(amount, coins);
		System.out.print(res);
	}
}

