public class NextMaxElement496 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		int idx = 0;
		for (int i = 0; i < nums1.length; i++) {
			ans[idx] = -1;
			int index = getIndex(nums2, nums1[i]);
			if (index == nums2.length -1) {
				idx++;
				continue;
			}
			for(int j = index; j < nums2.length; j++) {
				if (nums2[j] > nums1[i]) {
					ans[idx] = nums2[j];
					break;
				}
			}
			idx++;
			System.out.print(ans[i]);
		}
		return ans;
	}

	public int getIndex(int[] nums2, int x) {
		int ans = -1;
		for (int i = 0; i < nums2.length; i++) {
			if (x == nums2[i]) {
				ans = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		NextMaxElement496 obj = new NextMaxElement496();
		int[] nums1 = new int[]{4,1,2};
		int[] nums2 = new int[]{1,2,3,4};
		int[] ans = new int[nums1.length];
		ans = obj.nextGreaterElement(nums1,nums2);
		System.out.print(ans);

	}

}
