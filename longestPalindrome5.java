import java.util.ArrayList;
import java.util.List;


public class longestPalindrome5 {
	public String longestPalindrome(String s) {
		if(s==null || s.length()<1) return "";
		//reverse
		String reverse = new StringBuffer(s).reverse().toString();
		//将重复子字符串留存到一个List中，
		List<List<Character>> temp = new ArrayList();
		List<Character> t = new ArrayList<>();
		int k = 0, start = 0, end = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == reverse.charAt(i)){
				t.add(s.charAt(i));
			}else {
				//判断是否为回文，并且留下最大回文
				int j = 0,y = t.size();
				while (j < y && y >=0 ){
					if(t.get(j) == t.get(y)){
						k++;j++;y--;
					}else {
						k=0;
						y--;
					}
				}
				temp.add(t);
				t.clear();
			}
		}
		//判断连续子串中是回文的
		for(int i = 0; i < temp.size(); i++) {

		}

		return s.substring(start, end);
	}

}



