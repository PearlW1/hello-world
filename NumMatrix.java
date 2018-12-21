//https://leetcode.com/problems/range-sum-query-2d-immutable/
// sumRegion could be no for-recurrent, like getting shaded area

public class NumMatrix {

	int[][] input = null;

	public NumMatrix(int[][] matrix) {
		//边界条件
		if (matrix == null || matrix.length == 0){
			this.input = new int[0][0];//防止为null
			return;
		}

		this.input = new int[matrix.length + 1][matrix[0].length + 1];

		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				input[i + 1][j + 1] = input[i][j + 1] +input[i + 1][j] + matrix[i][j] - input[i][j];
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {

		if (row1 < 0 || row2 < 0 || col1 < 0 || col2 < 0)
			return -1;
		if (row1 > row2 || col1 > col2){
			return -1;
		}

		if (row1 >= this.input.length || row2 >= this.input.length || col1 >= this.input[0].length || col2 >= this.input[0].length)
			return  -1;

		return input[row2 + 1][col2 + 1] - input[row2 + 1][col1] - input[row1][col2 + 1] + input[row1][col1];
	}

	public static void main (String[] args){

		int[][] martrix = {	{3, 0, 1, 4, 2},
							{5, 6, 3, 2, 1},
							{1, 2, 0, 1, 5},
							{4, 1, 0, 1, 7},
							{1, 0, 3, 0, 5}};

	    NumMatrix obj = new NumMatrix(martrix);

	    System.out.print(obj.sumRegion(3, 3, 3, 3));
	}

}





//public class NumMatrix {
//
//	int[][] input = new int[0][0];
//
//	public NumMatrix(int[][] matrix) {
//		//边界条件
//		if (matrix == null || matrix.length == 0){
//			return;
//		}
//
//		int rows = matrix.length;
//		int cols = matrix[0].length;
//		for (int i = 0; i < rows; i++){
//			for (int j = 1; j < cols; j++){
//				matrix[i][j] = matrix[i][j - 1] + matrix[i][j];
//			}
//		}
//		input = matrix;
//	}
//
//	public int sumRegion(int row1, int col1, int row2, int col2) {
//		int sum = 0;
//		if (row1 > row2 || col1 > col2){
//			return -1;
//		}
//
//		for (int i = row1; i <= row2; i++){
//			sum = sum + (col1 == 0 ? input[i][col2] : input[i][col2] - input[i][col1-1]);
//		}
//
//		return sum;
//	}
//
//	public static void main (String[] args){
//
//		int[][] martrix = {	{3, 0, 1, 4, 2},
//				{5, 6, 3, 2, 1},
//				{1, 2, 0, 1, 5},
//				{4, 1, 0, 1, 7},
//				{1, 0, 3, 0, 5}};
//
//		NumMatrix obj = new NumMatrix(martrix);
//		System.out.print(obj.sumRegion(2, 1, 4, 3));
//	}
//
//}
