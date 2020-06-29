public class maxVowels {

//	int res;
	public int maxVowels(String s, int k) {
		int res = 0;
		char[] S = s.toCharArray();
		//累加
		int[] dp = new int[S.length];
		for (int i = 0; i < S.length; i++) {
			if (S[i] == 'a' || S[i] == 'e' || S[i] == 'i' || S[i] == 'o' || S[i] == 'u') {
				dp[i]++;
			}
		}
		int[] sum = new int[S.length ];
		sum[0] = dp[0];
		for (int i = 1; i < S.length; i++) {
			sum[i] = sum[i-1] + dp[i];
			if (i < k) res = sum[i];
			if (i > k) {
				res = Math.max(res, sum[i] - sum[i - k]);
			}
		}
		return res;
	}
//	public void dfs (char[] s, int left, int right, int k) {
//		if (left > s.length - k)  return;
//		int i = left;
//		int j = right;
//		int cnt = 0;
//		while ( i < j) {
//			if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
//				cnt++;
//			}
//			i++;
//		}
//		res = Math.max(res, cnt);
//		dfs (s, left + 1, right + 1, k);
//	}

	public static void main (String[] args) {

		maxVowels obj = new maxVowels();
		String s = "qempburycnhrvvccr";
		int k = 13;
		int res = obj.maxVowels(s, 13);
		System.out.print(res);

	}
}
