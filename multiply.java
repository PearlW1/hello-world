import java.util.ArrayList;
import java.util.List;

public class multiply {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int l = num1.length() - 1 , r =  num2.length() - 1;
		int[] res = new int[l + r + 2];
		int n1;int n2;
		int pro = 0; int carry = 0;
		int k = 0;
		while (l >=0 || r >= 0) {
			if (l >= 0) {
				n1 = num1.charAt(l) - '0';
			} else {
				n1 = 1;
			}
			if (r >= 0) {
				n2 = num2.charAt(r) - '0';
			} else {
				n2 = 1;
			}
			pro = n1 * n2 + carry;
			carry = pro / 10;
			res[k++] = pro % 10;
			l--;
			r--;
		}

		StringBuilder result = new StringBuilder();
		for (int i = k - 1; i >= 0; i--) {
			result.append(res[i]);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		multiply obj = new multiply();
		String num1 = "22", num2 = "32";
		String res =  new String();;
		res = obj.multiply(num1, num2);
		System.out.print(res);

	}

}
