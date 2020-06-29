import java.net.StandardSocketOptions;

public class maxAliveYear {
	public int maxAliveYear(int[] birth, int[] death) {
		//差分，申请数组year[] 出生年份+1，死亡年份，在第二年-1
		int[] year = new int[102];
		int base = 1900;
		for (int i = 0; i < birth.length; i++) {
			year[birth[i] - base]++;
			year[death[i] - base + 1]--;
		}
		int max = year[0];
		int maxYear = base;
		int sum = year[0];
		for (int i = 1; i < year.length; i++) {
//			System.out.print(year[i]);

			sum += year[i];
			System.out.print(sum);
			System.out.print("\n");
			if (max < sum) {
				max = sum;
				maxYear = i + base;
			}
		}
		return maxYear;
	}

	public static void main (String[] args) {

		maxAliveYear obj = new maxAliveYear();
		int[] birth = {1972,1908,1915,1957,1960,1948,1912,1903,1949,1977,1900,1957,1934,1929,1913,1902,1903,1901};
		int[] death = {1997,1932,1963,1997,1983,2000,1926,1962,1955,1997,1998,1989,1992,1975,1940,1903,1983,1969};
		int res = 0;
		res = obj.maxAliveYear(birth, death);
		System.out.print(res);

	}
}
