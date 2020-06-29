public class kthSmallest {

	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		int left = matrix[0][0], right = matrix[n-1][n-1];
		// 二分
		while (left < right) {
			int mid = left + (right - left)/2;
			int count = getCountLessEqual(matrix, mid);
			if (k > count)
				left = mid + 1;
			else
				right = mid;
		}
		return right;
	}

	private int getCountLessEqual(int[][] matrix, int mid) {
		int n = matrix.length;
		int count = 0;
		int i = 0, j = n - 1;
		while (i < n && j >= 0){
			if (matrix[i][j] > mid){
				count += i;
				j -= 1;
			}
			else{
				i += 1;
				if (i == n){
					count += n * (j + 1);
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		kthSmallest obj = new kthSmallest();
		int[][] matrix = {{1,  5,  9}, {10, 11, 13}, {12, 13, 15}};
		int k = 9;
		int res = 0;
		res = obj.kthSmallest(matrix, k);
		System.out.print(res);


	}
}
