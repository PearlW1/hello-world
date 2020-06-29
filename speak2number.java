import java.util.HashMap;
import java.util.Map;

public class speak2number {

//	输入：一个口述的数，比如“一万三千二百五”
//	输出：数字形式的：13250
	public String speak2number (String s) {
		//构造基本字典
	Map<Character, Character> mapDigi = new HashMap<Character, Character>(){
		{ put('一','1'); put('二','2'); put('三','3'); put('四','4'); put('五','5'); put('六','6'); put('七','7');
		put('八','8'); put('九','9'); put('零','0'); }
	};
	Map<Character, String> mapBit = new HashMap<Character, String>(){
		{put('十',"10");put('百',"100");put('千',"1000");put('万',"10000"); put('亿',"100000000"); }
		};
		//倒着统计s中的数字，将数字组件插入到res中 sb.insert( 0 , "A" ); // 在最前面插入一个：A
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 1; i--) {
			if (mapDigi.containsKey(s.charAt(i))) {
				sb.insert(0, mapDigi.get(s.charAt(i)));
			}
			//如果连续两个字符中，都是bit，比如 百万，则需要将mapbit中的数取出来，len相加
			if (mapBit.containsKey(s.charAt(i)) && mapBit.containsKey(s.charAt(i - 1))) {
				//首先判断bit的长度跟sb的长度是否相等，不相等，则sb用0补充
				String temp = mapBit.get(s.charAt(i));
				String temp2 = mapBit.get(s.charAt(i - 1));
				while (temp.length() + temp2.length() - 1 > sb.length()) {
					sb.insert(0, '0');
				}
			} else if (mapBit.containsKey(s.charAt(i)) && !mapBit.containsKey(s.charAt(i - 1))) {
				String temp = mapBit.get(s.charAt(i));
				if (temp.length() - 1 > sb.length()) {
					do {
						sb.insert(0, '0');
					} while (temp.length() - 1 > sb.length());
				}
			}
		}
		sb.insert(0, mapDigi.get(s.charAt(0)));

		return sb.toString();

	}

	public static void main(String args[]) {
		speak2number obj = new speak2number();
		String s = "一千零四十";
		String res = obj.speak2number(s);
		System.out.print(res);

	}
}
