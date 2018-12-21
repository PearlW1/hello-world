//https://leetcode.com/problems/group-anagrams/
import java.util.*;

public class GroupAnagrams4901 {
	//26个素数
	private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
	public List<List<String>> groupAnagrams(String[] strs) {
		//边界条件
		if (strs == null || strs.length == 0)
			return new ArrayList<List<String>>();

		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

		for (String str: strs) {
			int key = hash(str);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(str);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public int hash (String str) {
		int val = 1;
		char[] temp;
		temp = str.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			val *= primes[temp[i] - 'a'];
		}
		return val;
	}

	public static void main (String[] args) {

		GroupAnagrams4901 obj = new GroupAnagrams4901();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.print(obj.groupAnagrams(strs));

	}
}