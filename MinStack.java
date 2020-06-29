import java.util.Stack;

public class MinStack {
	Stack<Integer> stack;
	int min;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new Stack<Integer>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		//每次都将最小值再次push一次，
		if (x <= min) {
			stack.push(min);
//			System.out.print("push value1:");
//			System.out.print(stack.peek());
			min = x;
		}
		stack.push(x);
//		System.out.print("push value2:");
//		System.out.print(stack.peek());
	}

	public void pop() {
		System.out.print("-----pop value:");
		System.out.print(stack.peek());
		if (stack.pop() == min) { //已经有一次pop操作，将同最小值一样的元素进行了pop，接下来pop第二个元素
			System.out.print("---------pop value1:");
			System.out.print(stack.peek());
			min = stack.pop();
		}
	}

	public int top() {

		return    stack.peek();

	}

	public int min() {
		return min;
	}

	public static  void main(String []args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		for(int i = 0; i < 10; i++) {
			System.out.print(obj.top());
			obj.pop();
		}

	}
}