import java.util.Arrays;
import java.util.HashMap;

public class findTheLongestSubstring {

	public int findTheLongestSubstring(String s) {
		int res = 0;
		char[] c = s.toCharArray();
		// Key为前i项的前缀和，value为i
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] dp = new int[c.length+1];
		dp[0] = 0;
		for(int i = 0; i < c.length; i++) {
			// 当遇到元音时进行异或运算，两个相同字母异或运算为0
			if( c[i] == 'a' ||
					c[i] == 'e' ||
					c[i] == 'i' ||
					c[i] == 'o' ||
					c[i] == 'u') {
				dp[i+1] = dp[i] ^ c[i];
				System.out.print(i);
				System.out.print("  ");
				System.out.print(dp[i+1]);
				System.out.print('\n');}
				// 如果遇到非元音字母则保持前项结果
			else
				dp[i+1] = dp[i];
			// 如果前项和为0，则说明此字串为满足题意要求的子串
			if (dp[i+1] == 0) {
				res = i + 1;
				continue;
			}
			// 如果当前map中存在当前的前缀和，则当前前缀和与前部前缀和异或运算也为0
			if(map.containsKey(dp[i+1])) {
				res = Math.max(res,i - map.get(dp[i+1]));
			}
			// 若不含当前字串前缀和，将其前缀和作为key，i作为value加入map中
			else
				map.put(dp[i+1],i);
		}
		return res;
	}


	public int findTheLongestSubstringS(String s) {
		int n = s.length();
		int[] pos = new int[1<<5];
		Arrays.fill(pos, -1);
		int ans = 0, status = 0;
		pos[0] = 0;
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				status ^= (1 << 0);
			} else if (ch == 'e') {
				status ^= (1 << 1);
			} else if (ch == 'i') {
				status ^= (1 << 2);
			} else if (ch == 'o') {
				status ^= (1 << 3);
			} else if (ch == 'u') {
				status ^= (1 << 4);
			}
			if (pos[status] >= 0) {
				ans = Math.max(ans, i + 1 - pos[status]);
			} else {
				pos[status] = i + 1;
			}
		}
		return ans;
	}

//	作者：LeetCode-Solution
//	链接：https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/solution/mei-ge-yuan-yin-bao-han-ou-shu-ci-de-zui-chang-z-2/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

	public static void main(String[] args) {

		findTheLongestSubstring obj = new findTheLongestSubstring();
		String s = "leetcode";
		int res = 0;
		res = obj.findTheLongestSubstring(s);
//		System.out.print(res);


	}

}
