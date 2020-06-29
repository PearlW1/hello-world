//https://leetcode.com/problems/climbing-stairs/
/*
/题意：爬楼梯，一共有n个台阶，每次能爬一个或者两个台阶，问：有多少种方法能爬上去。
解题：
1.这个题一看，能用dfs。边界：当n小于等于2的时候，跳出dfs递归。
2.听说有logn的解法：

 */
//1.dfs方法：这是hx的没有返回值的方法，如果写为有返回的dfs呐？返回的又是什么呢?复杂度
public class ClimbingStairs1 {
	private int count = 0;
	public void dfs(int target) {

		if(target <= 2) {
			this.count += target;
			return;
		}
		dfs(target-1);
		dfs(target-2);
	}
	public static void main(String[] args) {

		ClimbingStairs1 obj = new ClimbingStairs1();
		int n = 3;
		obj.dfs(n);
		System.out.print(obj.count);
	}
}
