import java.util.LinkedList;

public class decodeString {

	public String decodeString(String s) {
		StringBuilder res = new StringBuilder();
		int multi = 0;
		LinkedList<Integer> stack_multi = new LinkedList<>();
		LinkedList<String> stack_res = new LinkedList<>();
		for (Character c: s.toCharArray()) {
			if (c == '[') {
				stack_multi.addLast(multi);
				stack_res.addLast(res.toString());
				//归零，重新统计[]
				multi = 0;
				res = new StringBuilder();
			} else if (c == ']') {
				StringBuilder tmp = new StringBuilder();
				int multi_cur = stack_multi.removeLast();
				//res中此时放的为]前的字母
				for (int i = 0; i < multi_cur; i++) tmp.append(res);
				res = new StringBuilder(stack_res.removeLast() + tmp);
			} else if (c >= '0' && c <= '9') {
				//应对32[ac]数字不止一位数的情况
				multi = multi * 10 + Integer.parseInt(c + "");
			} else {
				res.append(c);
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {

		decodeString obj = new decodeString();
		String s = "3[a]2[bc]";
		String res = "";
		res = obj.decodeString(s);
		System.out.print(res);


	}
}
