//https://leetcode.com/problems/count-and-say/



public class CountAndSay38 {
	public String countAndSay(int n) {

		if (n < 1 || n > 30) return "";
		if (n == 1) return "1";

		String[] result = new String[30];
		result[0] = "1";
		for (int i = 1; i < n; i++) {
			char[] chr = result[i-1].toCharArray();
			String str = "";
			int count = 1;
			for (int j = 0; j < chr.length - 1; j++) {
				if (chr[j] == chr[j+1]) {
					count++;
				} else {
					str = str + count + chr[j];
					count = 1;
				}
			}
			result[i] = str + count + chr[chr.length - 1];
		}
		return result[n-1];
	}

	public static void main (String[] args) {

		CountAndSay38 obj = new CountAndSay38();
		System.out.print(obj.countAndSay(5));

	}
}
