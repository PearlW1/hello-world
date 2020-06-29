import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class multiSearch {

	private int[][] res;
	private String global_big;

	public int[][] multiSearch(String big, String[] smalls) {
		int len = smalls.length;
		res = new int[len][];
		global_big = big;
		for (int i = 0; i < len; ++i)
			addToRes(i, smalls[i]);
		return res;
	}

	private void addToRes(int position, String str) {
		if (str.equals("")) {
			res[position] = new int[0];
			return;
		}
		LinkedList<Integer> list = new LinkedList<>();
		int idx = 0;
		int len = global_big.length();
		while (idx < len && idx + str.length() < len) {
			String tem = global_big.substring(idx, idx + str.length());
			if (str.equals(tem)) {
				list.addLast(idx);
			}
			idx++;
		}
		// while ((idx = global_big.indexOf(str, idx) + 1) != 0)
		//     list.addLast(idx - 1);
		res[position] = list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		multiSearch obj = new multiSearch();
		String s = "mississippi";
		String[] str = {"is","ppi","hi","sis","i","ssippi"};
		int[][] res = obj.multiSearch(s, str);
		System.out.print(res);

	}
}
