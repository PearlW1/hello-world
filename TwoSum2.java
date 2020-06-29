//https://leetcode.com/problems/two-sum/  最好的解法。
//step1 : copy an array, and sort it using quick sort, O(nlogn)

//step2 : using start and end points to find a, b which satifys a+b==target, O(n)

//step3 : find the index of a, b from origin array, O(n)


import java.util.Arrays;

public class TwoSum2 {
	public int[] twoSum(int[] nums, int target) {
		if(null == nums) return null;
		int[] res = new int[2];

		int[] nums2 = Arrays.copyOf(nums, nums.length);
		Arrays.sort(nums2);

		//find sum factor a and b
		int a = 0; int b = 0;
		int start = 0; int end = nums.length - 1;
		while (start < end) {
			if (nums2[start] + nums2[end] < target) {
				start++;
			} else if(nums2[start] + nums2[end] > target) {
				end--;
			} else {
				a = nums2[start]; b = nums2[end];
				break;
			}
		}

		//find a index in array nums
		for (int i = 0; i < nums.length; i++) {
			if (a == nums[i]) {
				res[0] = i;
				break;
			}
		}

		// may a=b
		if (a == b) {
			for (int j = res[0]; j < nums.length; j++) {
				if (b == nums[j]) {
					res[1] = j;
					break;
				}
			}
		} else {
			for (int j = 0; j < nums.length; j++) {
				if (b == nums[j]) {
					res[1] = j;
					break;
				}
			}

		}

		return res;
	}

	public static void main(String args[]) {
		TwoSum2 obj = new TwoSum2();
		int[] num = {2, 7, 11, 15};
		int target = 9;
		System.out.print(target);
		int[] res = obj.twoSum(num, target);
		System.out.print(res);
		System.out.print(obj.twoSum(num, target));
	}


}
