import java.util.HashMap;
import java.util.Map;

public class romanToInt {


	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);

		int res = map.get(s.charAt(s.length()-1));
		for (int i = s.length()-2; i >=0; i--) {
			if ( (s.charAt(i) == 'I') && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
				res = res - map.get(s.charAt(i));
				continue;
			}else if ((s.charAt(i) == 'X') && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
				res = res - map.get(s.charAt(i));
				continue;
			}else if ((s.charAt(i) == 'C') && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
				res = res - map.get(s.charAt(i));
				continue;
			}
			res = map.get(s.charAt(i)) + res;
		}
		return res;
	}

	public static void main(String []args){

		String x = "III";
		romanToInt obj = new romanToInt();

		int res = obj.romanToInt(x);
		System.out.print(res);
	}


}
