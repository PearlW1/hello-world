import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();//key出现的字符，value对应的最新的位置
		// try to extend the range [i, j]
		for (int end = 0, start = 0; end < n; end++) {
			if (map.containsKey(s.charAt(end))) {
				start = Math.max(map.get(s.charAt(end)) + 1, start);//由于重复的坐标不知道在start的前方还是后方，所以要取个最大值
			}
			ans = Math.max(ans, end - start + 1);
			map.put(s.charAt(end), end);
		}
		return ans;
	}

	public static void main(String[] args) {

		lengthOfLongestSubstring obj = new lengthOfLongestSubstring();
		String s = "abcabcbb";
		int res = 0;
		res = obj.lengthOfLongestSubstring(s);
		System.out.print(res);


	}
}
