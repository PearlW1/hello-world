public class getMaxMatrix {
	//https://www.bilibili.com/video/BV1j5411t7ik
	public int[] getMaxMatrix(int[][] matrix) {
		int r = matrix.length, c = matrix[0].length;
		//列相加
		int[][] acc = new int[c][r + 1];
		for (int cc = 0; cc < c; cc++) {
			for (int rr = 0; rr < r; rr++) {
				acc[cc][rr + 1] = acc[cc][rr] + matrix[rr][cc];
			}
		}
		int[] ans = new int[]{0,0,0,0};
		int  mval = Integer.MIN_VALUE;
		for (int sr = 0; sr < r; sr++) {
			for (int er = sr; er < r; er++) {
				int dp = Integer.MIN_VALUE, mc = 0;
				for (int cc = 0; cc < c; cc++) {
					if (dp > 0) {
						dp += acc[cc][er + 1] - acc[cc][sr];
					} else {
						mc = cc;
						dp = acc[cc][er + 1] - acc[cc][sr];
					}
					if (dp > mval) {
						mval = dp;
						ans = new int[]{sr, mc, er, cc};
					}
				}
			}
		}
		return ans;
	}

	public static void main (String[] args) {

		getMaxMatrix obj = new getMaxMatrix();
		int[][] matrix = {{9,-8,1,3,-2},{-3,7,6,-2,4},{6,-4,-4,8,-7}};
		int[] res = obj.getMaxMatrix(matrix);
		System.out.print(res);

	}


}
