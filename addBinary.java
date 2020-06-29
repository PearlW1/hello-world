public class addBinary {
	public String addBinary(String a, String b) {
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = carry;
			sum += i >= 0 ?a.charAt(i): 0;
			sum += j >= 0 ?b.charAt(j): 0;
			sb.append(sum % 2);
			carry = sum / 2;
		}
		sb.append(carry == 1? carry: "");

		return sb.reverse().toString();

	}
	public static void main(String args[]) {
		addBinary obj = new addBinary();
		String S = "11", T = "1";

		String res = obj.addBinary(S, T);
		System.out.print(res);
	}

}
