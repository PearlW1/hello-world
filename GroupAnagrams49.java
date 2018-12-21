import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		//boundary
		if (strs == null || strs.length == 0)
			return new ArrayList<List<String>>();

		Map<String, List<String>> map = new HashMap<String , List<String>>();

		for (int i = 0; i < strs.length; i++) {
			char[]temp = strs[i].toCharArray();
			Arrays.sort(temp);
//			String strKey = temp.toString();
			String strKey = new String(temp);
			if (!map.containsKey(strKey)) {
				map.put(strKey,new ArrayList<String>());
			}
			map.get(strKey).add(strs[i]);
		}

		return new ArrayList<List<String>>(map.values());
	}

	public static void main (String[] args) {

		GroupAnagrams49 obj = new GroupAnagrams49();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.print(obj.groupAnagrams(strs));

	}
}


//20181218第一版本
//import java.util.*;
//
////https://leetcode.com/problems/group-anagrams/
//public class GroupAnagrams49 {
//
//	public List<List<String>> groupAnagrams(String[] strs) {
//		//边界条件
//		if (strs == null || strs.length == 0)
//			return new ArrayList<List<String>>();
//
//		Map<String, List<String>> map = new HashMap<String, List<String>>();
//		List<String> keys = new ArrayList();
//		List<List<String>> result = new ArrayList<List<String>>();
//
//		for (int i = 0; i < strs.length; i++) {
//			char[]temp = strs[i].toCharArray();
//			Arrays.sort(temp);
//			String strKey = temp.toString();//此处 变换的不对
//			System.out.print(strKey);
//			if (!map.containsKey(strKey)) {
//				map.put(strKey,new ArrayList<String>());
//				keys.add(strKey);
//			}
//			map.get(strKey).add(strs[i]);
//			System.out.print(map);
//		}
//
//		for (int i = 0; i < keys.size(); i++){
//			System.out.print(map.get(keys.get(i)));
//			result.add(map.get(keys.get(i)));
//		}
//
//		return result;
//	}
//
//	public static void main (String[] args) {
//
//		GroupAnagrams49 obj = new GroupAnagrams49();
//		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//		System.out.print(obj.groupAnagrams(strs));
//
//	}
//}

