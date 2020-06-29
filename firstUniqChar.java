import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
	public char firstUniqChar(String s) {
		int len = s.length();
		if (len == 0) return ' ';
		char res = ' ';
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++){
			if (map.containsKey(s.charAt(i))){
				map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < len; i++){
			if (map.get(s.charAt(i)) == 1) {
				res = s.charAt(i);
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		firstUniqChar obj = new firstUniqChar();
		String s = "leetcode";
		int res = 0;
		res = obj.firstUniqChar(s);
		System.out.print(res);


	}


}
