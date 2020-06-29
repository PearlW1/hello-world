//https://leetcode.com/problems/two-sum/

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				res[0] = i; res[1] = map.get(diff);
			} else {
				map.put(nums[i], i);
			}
		}
	return res;
	}
	public static void main(String args[]) {
		TwoSum3 obj = new TwoSum3();
		int[] num = {2, 7, 11, 15};
		int target = 9;
		int[] res = obj.twoSum(num, target);
		System.out.print(res);
		System.out.print(obj.twoSum(num, target));
	}

}
