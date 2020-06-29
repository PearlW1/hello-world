public class HeightCheck1051 {
	public int heightChecker(int[] heights) {
		int[] arr = new int[101];
		for (int height : heights) {
			arr[height]++;
		}
		int count = 0;
		for (int i = 1, j = 0; i < arr.length; i++) {
			while (arr[i]-- > 0) {
				if (heights[j++] != i) count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		HeightCheck1051 obj = new HeightCheck1051();
		int[] heights = {1,1,4,2,1,3};
		int res = obj.heightChecker(heights);
		System.out.print(res);
	}

}
