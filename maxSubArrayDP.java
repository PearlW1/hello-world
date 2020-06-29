//https://leetcode.com/problems/maximum-subarray/submissions/
//问题：求一个数据中，连续元素最大和。
//分析：可将问题分解为子问题的解，连续子问题，可以考虑从左往右或者从右往左计算连续元素的和，当前元素和前面元素和做比较，取最大。
// 动态规划的状态转移方程：dp[i] = max(nums[i],nums[i]+dp[i-1])

public class maxSubArrayDP {

	public int maxSubArrayDP(int[] nums) {

		//boundary
		if (nums.length == 0) return 0;

		//declare
		int max = nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = nums[i] > nums[i] + dp[i-1] ? nums[i] : nums[i] + dp[i-1];

			if (dp[i] > max) max = dp[i];
		}

		return max;

	}

	public static void main (String[] args) {

		maxSubArrayDP obj = new maxSubArrayDP();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int res = 0;
		res = obj.maxSubArrayDP(nums);
		System.out.print(res);

	}
}
