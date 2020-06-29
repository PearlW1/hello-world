//https://leetcode.com/problems/combination-sum/
//39 给定一个没有重复元素的数组和一个数，从一个数组中找出所有的元素组合使得其和是给定的数，这里元素可以重复使用。
// tip:树型问题，这类问题他本身没有定义在一颗二叉树中，但我们具体分析这个问题时就会发现解决这个问题的思路本质是一颗树的形状。

import java.util.*;

public class CombinationSum {

	public List<List<Integer>> ConbSum(int[] candidate, int target) {

		List<List<Integer>> ans = new ArrayList<>();
		dfs(ans,candidate,target, new ArrayList<>(), 0 );
		return ans;
	}

	//dfs 找到边界
	public void dfs(List<List<Integer>> ans, int[] cand, int target, List<Integer> cur, int idx) {
		if (0 == target) {
			ans.add(new ArrayList<>(cur));
			return;
		}

		if(target < 0 || idx > cand.length) return;
		//v1版本写的int i = 0;导致dfs从新开始搜索，使得结果中存在重复
		for (int i = idx; i < cand.length; i++) {
			cur.add(cand[i]);
			dfs(ans, cand, target - cand[i], cur, i);
			cur.remove(cur.size() - 1);
		}

	}

	public static void main (String agrs[]) {

		int[] cand = {2,3,6,7};
		int target = 7;
		CombinationSum obj = new CombinationSum();
		List<List<Integer>> ans = new ArrayList<>();
		ans = obj.ConbSum(cand, target);
		System.out.print(ans);
	}
}











//20190214结果有重复
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//public class CombinationSum {
//
//	public List<List<Integer>> ConbSum(int[] candidate, int target) {
//
//		List<List<Integer>> ans = new ArrayList<>();
//		dfs(ans,candidate,target, new ArrayList<>(), 0 );
//		//结果去重
////		Set<List<Integer>>
//
//		return ans;
//	}
//
//	//dfs 找到边界
//	public void dfs(List<List<Integer>> ans, int[] cand, int target, List<Integer> cur, int idx) {
//		if (0 == target) {
//			ans.add(new ArrayList<>(cur));
//			return;
//		}
//
//		if(target < 0 || idx > cand.length) return;
//
//		for (int i = 0; i < cand.length; i++) {
//			cur.add(cand[i]);
//			dfs(ans, cand, target - cand[i], cur, i);
//			cur.remove(cur.size() - 1);
//		}
//
//	}
//
//	public static void main (String agrs[]) {
//
//		int[] cand = {2,3,6,7};
//		int target = 7;
//		CombinationSum obj = new CombinationSum();
//
//		System.out.print(obj.ConbSum(cand, target));
//
//	}
//
//}
