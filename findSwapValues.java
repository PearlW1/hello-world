import java.util.HashSet;
import java.util.Set;

public class findSwapValues {

	public int[] findSwapValues(int[] array1, int[] array2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int num: array1) {
			sum1 += num;
		}
		for (int num: array2) {
			sum2 += num;
		}
		int diff = (sum1 - sum2)/2 ;
		int[] res = new int[2];
		if (diff % 2 != 0) return res;
		Set<Integer> a2 = new HashSet<Integer>();
		for (int num: array2) {
			a2.add(num);
		}
		for (int n: array1) {
			if (a2.contains(n - diff)){
				res[0] = n;
				res[1] = n - diff;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		findSwapValues obj = new findSwapValues();
		int[] n1 = {4, 1, 2, 1, 1, 2};
		int[] n2 = {3, 6, 3, 3};
		int[] res = new int[2];
		res = obj.findSwapValues(n1, n2);
		System.out.print(res);


	}
}
