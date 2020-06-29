public class gcdOfStrings {

	public String gcdOfStrings(String str1, String str2) {
		//从长度最小的字符串进行遍历，最开始的长度为x的最大长度
		String res = "";
		int len1 = str1.length(), len2 = str2.length();
		for (int k = Math.min(len1, len2); k >=1; --k) {
			if (len1%k == 0 && len2 % k == 0) {
				String x = str1.substring(0, k);
//				boolean m = check(x, str1);
//				boolean n = check(x, str2);
				if (check(x, str1) && check(x,str2)) {
					res = x;
					break;
				}
			}
		}
		return res;

	}

	public boolean check(String x, String str){
		//判断x是否整除str，找出长度，然后遍历，判断是否相等
		int len = str.length() / x.length();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < len; i++) {
			ans.append(x);
		}
		return ans.toString().equals(str);
	}

	public static void main(String[] args) {
		gcdOfStrings obj = new gcdOfStrings();
		String str1 = "ABCABC";
		String str2 = "ABC";
		String ans = obj.gcdOfStrings(str1,str2);
		System.out.print(ans);

	}


}
