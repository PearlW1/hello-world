public class myAtoi {
//	https://leetcode-cn.com/problems/string-to-integer-atoi/submissions/

	public int myAtoi(String str) {
		if (str.length() == 0 || str.isEmpty() || str.trim() == "") return 0;
		//去除空格；
		String s = str.trim();
		int flag = 1;
		int i= 0;
		//找正负号
		int res = 0;
		if (s.charAt(i) == '-') {flag = -1;}
		if (s.charAt(i) == '+' || s.charAt(i) == '-'){i++;}
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int r = s.charAt(i) - '0';
			//溢出处理
			if (res > 2147483647/10 || (res == 2147483647/10 && r > 7)){
				return flag > 0? Integer.MAX_VALUE: Integer.MIN_VALUE;
			}

			//结果处理
			res = res * 10 + r;
			i++;
		}

		return flag>0?res:-res;
	}

	public static void main(String[] args) {
		myAtoi obj = new myAtoi();
		String s = "-91283472332";
		int ans =0;
		ans = obj.myAtoi(s);
		System.out.print(ans);

	}
}

