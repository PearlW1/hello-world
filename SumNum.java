import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumNum {

	public static void main(String[] args) {
		int[] nums = {-1, -1, 0, 0, 1, 2, -2, 8, 9, 10};
		int[] nums1 = {9, 9, 8, 10};
		List<List<Integer>> res = new ArrayList<>();
		SumNum obj = new SumNum();
		res = obj.SumNum(nums1);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	//方法  测试用例
	//数组，找a+b+c=0的组合
	public List<List<Integer>> SumNum (int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		if (nums.length == 0) return res;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			int sum = 0 - nums[i];
			while (left < right) {
				if (nums[left] + nums[right] == sum) {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[left]);
					temp.add(nums[right]);
					res.add(temp);
					left++;
					right--;
				} else if (nums[left] + nums[right] < sum) left++;
				else {
					right--;
				}
			}
		}
		return res;
	}
}
