//https://leetcode.com/problems/two-sum/
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.

		Example:

		Given nums = [2, 7, 11, 15], target = 9,

		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
*/

public class TwoSum1 {
	public int[] twoSum(int[] num, int target) {
		int[] res = new int[2];
		for(int i = 0; i < num.length-1; i++) {
			int diff = target - num[i];
			for(int j = i+1; j < num.length; j++) {
				if(num[j] == diff) {
					res[0] = i;
					res[1] = j;
					break;
				}
			}
		}

		return res;
	}

	public static void main(String args[]) {
		TwoSum1 obj = new TwoSum1();
		int[] num = {2, 7, 11, 15};
		int target = 9;
		int[] res = obj.twoSum(num, target);
		System.out.print(res);
		System.out.print(obj.twoSum(num, target));
	}

}
