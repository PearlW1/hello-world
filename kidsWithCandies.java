import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList();
		int max = candies[0];
		for (int i = 1; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				res.add(true);
			} else {
				res.add(false);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		lengthOfLongestSubstring obj = new lengthOfLongestSubstring();
		String s = "abcabcbb";
		int res = 0;
		res = obj.lengthOfLongestSubstring(s);
		System.out.print(res);


	}
}
