import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minSubsequence {

	public List<Integer> minSubsequence(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		 if (nums.length == 1) {
			 res.add(nums[0]);
			 return res;
		 }
		 int sum = 0;
		 for (int n : nums) {
		 	sum += n;
		 }

		Arrays.sort(nums);
		int j = nums.length-1; int i = 0;

		int ls = 0, rs = 0;
		while (i <= j) {
			if(ls < rs) {
				ls += nums[i];
				i++;
			} else {
				rs += nums[j];
				j--;
			}
		}
		if (rs <= ls) {i = i - 1;}
		for (int k = nums.length-1; k >= i; k--){
			res.add(nums[k]);
		}

		return res;
	}

	public static void main(String[] args) {
		minSubsequence obj = new minSubsequence();
		int[] nums = {4,6,4,4,8,5,1,7,9};
		List<Integer> res =  new ArrayList<Integer>();;
		res = obj.minSubsequence(nums);
		System.out.print(res);

	}
}
