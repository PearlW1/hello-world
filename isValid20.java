import java.util.List;
import java.util.Stack;

public class isValid20 {

	public boolean isValid(String s) {
		if (s.length() == 0) return true;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
				continue;
			} else {
				// Character cur = new Character()
				if ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') || (stack.peek() == '{' && s.charAt(i) == '}')) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}

		}

		return stack.isEmpty();
	}

	public static void main(String args[]) {
		isValid20 obj = new isValid20();
		String s = "([)";
		boolean res = obj.isValid(s);
		System.out.print(res);
	}

}
