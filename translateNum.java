import java.util.ArrayList;
import java.util.List;

public class translateNum {
	public int translateNum(int num) {

		String nums = String.valueOf(num);
		if (nums.length() == 1) return 1;
		if (nums.length() == 2) {
			return nums.compareTo("25") > 0? 1: 2;
		}
		int[] dp = new int[nums.length()+1];
		dp[1] = 1;
		dp[2] = nums.substring(0,2).compareTo("25") > 0? 1: 2;
		for (int i= 3; i <= nums.length(); i++){
			if (nums.substring(i-2,i).compareTo("25") > 0 || nums.substring(i-2,i).compareTo("10") < 0) {
				dp[i] = dp[i-1];
			}else{
				dp[i] = dp[i-1] + dp[i-2];
			}
		}
		return dp[nums.length()];
	}

	public static void main(String args[]) {
//		translateNum obj = new translateNum();
//		int num = 624;
//		int res = obj.translateNum(num);
//		System.out.print(res);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 0; i < 2; i++) {
			System.out.print(list.remove(0));
			System.out.print('\n');
		}
		System.out.print("oooooo");
		for (int i = 0 ; i <3; i++) {
			System.out.print(list.get(i));
			System.out.print('\n');
		}
	}

}
