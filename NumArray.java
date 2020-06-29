//https://leetcode.com/problems/range-sum-query-immutable/
//tip：构造函数中修改输入矩阵，将反复调用的加法处理，放在构造函数中对输入进行变形处理。
public class NumArray {

	public int[] sum;
	public NumArray(int[] nums) {
		sum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			sum[i + 1] = sum[i] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sum[j + 1] - sum[i];
	}

	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		int res = obj.sumRange(1,2);
		System.out.print(res);
	}

}

