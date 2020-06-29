import java.util.ArrayList;
import java.util.List;

public class trigle {
	public List<List<Integer>> trigle (int k) {
		if (k == 0) return new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		temp.add(1);
		res.add(temp);
//5
		for (int i = 1; i < k; i++) {
			int left = 0;
			int right = i;
			temp = new ArrayList<>();
			ans = res.get(i - 1);


			res.add(temp);
		}

		return res;
	}


}
