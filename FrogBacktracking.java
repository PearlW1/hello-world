/*
青蛙为例，当面对第一个台阶时，他有两个选择。当他选择一种选择后，将“义无反顾”的一条道走下去，每层都会进行一次选择，直到走到地n层位置时。
这时，青蛙已经触碰到了边界，并得到了一种方案，之后青蛙会返回到最近的上一次选择时的情景，选择第二种情况继续走下去。以此往复，直到搜索全部的情景。
http://blog.ihuxu.com/divide-and-conquer-backtracking-and-dynamic-programming-from-a-frog-jumping-out/
 */

public class FrogBacktracking {

	public int count = 0;
	public void dfs( int target) {
		//剩余一个台阶累加一种方案，剩余两个台阶，累加另外一种方案；
		if( target <= 2) {
			this.count += target;
			return ;
		}
		//递归法
		dfs(target - 1);
		dfs(target - 2);
	}

	public static void main(String args[]) {

		FrogBacktracking obj = new FrogBacktracking();
		int target = 4;
		obj.dfs(target);

		System.out.print(obj.count);

	}
}
