import java.util.Stack;

public class backspaceCompare844 {
	public boolean backspaceCompare(String S, String T) {

		Stack<Character> s = new Stack<>();
		Stack<Character> t = new Stack<>();
		for (Character c : S.toCharArray()) {
			if (c == '#' && !s.isEmpty())//
				s.pop();
				// 第一个条件栈为空不符,跳到这,但是'#'不能添加进来,所以加限制条件
			else if (c != '#')
				s.push(c);
		}

		for (Character c : T.toCharArray()) {
			if (c == '#' && !t.isEmpty())
				t.pop();
			else if (c != '#')
				t.push(c);
		}

		if (s.size() != t.size()) {
			return false;
		}
		while (s.size() != 0) {
			if (!s.isEmpty() && !t.isEmpty() && s.pop() != t.pop())
				return false;
		}
		return true;

	}

	public static void main(String args[]) {
		backspaceCompare844 obj = new backspaceCompare844();
		String S = "a##c", T = "#ac";

		boolean res = obj.backspaceCompare(S, T);
		System.out.print(res);
	}


}
