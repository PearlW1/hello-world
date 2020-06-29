/*
输入：一个词典<temtmid, list<newid>>
输出：把所有新闻输出的list

同一个主题下的新闻，尽可能不挨着，
同一个主题下的新闻的顺序，是相对保序列
* */

import java.util.*;

import java.util.ArrayList;



public class themeList {


	public List<Integer> themeList (Map<Integer, List<Integer>> map) {
		List<Integer> res = new ArrayList<>();
		List<Integer> temp1 = new ArrayList<>();
		List<Integer> temp2 = new ArrayList<>();
		Iterator<Integer> iterator = map.keySet().iterator();
		int l1 = 0;
		int l2 = 0;
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			if (temp1.size() == 0) {
				temp1 = map.get(key);
			} else {
				temp2 = map.get(key);
			}
			while (l1 < temp1.size() && l2 < temp2.size()) {
				res.add(temp1.remove(l1++));
				res.add(temp2.remove(l2++));
			}
			if (l1 == temp1.size()) l1 = 0;
			if (l2 == temp2.size()) l2 = 0;
		}
		while (l1 < temp1.size()) res.add(temp1.remove(l1++));
		while (l2 < temp2.size()) res.add(temp2.remove(l2++));
		return res;
	}

//	public static void main(String args[]) {
//		themeList obj = new themeList();
//		Dictionary map = new Hashtable();
//		map.put(123, {12,12});
//		int res = obj.themeList();
//		System.out.print(res);
//	}


}
