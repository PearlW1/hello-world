import java.util.Arrays;

public class findBestValue {

	public int findBestValue(int[] arr, int target) {
		if (arr.length == 0) return 0;
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = (target - sum) / (arr.length - i);
			if (x <arr[i]) {
				double t = (double)(target - sum) / (arr.length - 1);
				if (t - x > 0.5) {
					return x + 1;
				} else {
					return x;
				}
			}
			sum+= arr[i];
		}
		return arr[arr.length - 1];
	}
	public static void main(String[] args) {

		findBestValue obj = new findBestValue();
		int[] arr = {2,3,5};
		int target = 10;
		int res;
		res = obj.findBestValue(arr, target);
		System.out.print(res);


	}
}
