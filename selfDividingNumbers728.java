import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbers728 {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			String s = String.valueOf(i);
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				int v = s.charAt(j) - 48;
				if (v == 0) break;
				if (i % v == 0) cnt++;
			}
			if (cnt == s.length()) res.add(i);
		}
		return res;
	}

	public static void main(String args[]) {
		selfDividingNumbers728 obj = new selfDividingNumbers728();
		int left = 1;
		int right = 22;
		List<Integer>  res = obj.selfDividingNumbers(left, right);
		System.out.print(res);
	}
}
