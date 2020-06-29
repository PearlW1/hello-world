public class jump {
	public int jump(int[] nums) {
		int length = nums.length;
		int end = 0;
		int maxPosition = 0;
		int steps = 0;
		for (int i = 0; i < length - 1; i++) {
			maxPosition = Math.max(maxPosition, i + nums[i]);
			if (i == end) {
				end = maxPosition;
				steps++;
			}
		}
		return steps;
	}
	public static void main(String args[]) {
		jump obj = new jump();
		int[] nums = {2,3,1,1,4};
		int res = obj.jump(nums);
		System.out.print(res);
	}
}
