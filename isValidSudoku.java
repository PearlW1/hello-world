public class isValidSudoku {
	private final int L = 9;
	public boolean isValidSudoku(String[][] board) {
		boolean[][] rows = new boolean[L][L];
		boolean[][] cols = new boolean[L][L];
		boolean[][] boxes = new boolean[L][L];

		for (int r = 0; r < L; ++r) {
			for (int c = 0; c < L; ++c) {
				if (board[r][c].equals(".")) {
					int value = Integer.valueOf(board[r][c]) - Integer.valueOf("1");
					int boxIndex = r / 3 * 3 + c / 3;
					if (rows[r][value] || cols[c][value] || boxes[boxIndex][value]) {
						return false;
					}
					rows[r][value] = true;
					cols[c][value] = true;
					boxes[boxIndex][value] = true;
				}
			}
		}
		return true;
	}
	public static void main(String args[]) {
		isValidSudoku obj = new isValidSudoku();
		String[][] s = {
				{"5","3",".",".","7",".",".",".","."},
				{"6",".",".","1","9","5",".",".","."},
				{".","9","8",".",".",".",".","6","."},
				{"8",".",".",".","6",".",".",".","3"},
				{"4",".",".","8",".","3",".",".","1"},
				{"7",".",".",".","2",".",".",".","6"},
				{".","6",".",".",".",".","2","8","."},
				{".",".",".","4","1","9",".",".","5"},
				{".",".",".",".","8",".",".","7","9"}};


		boolean res = obj.isValidSudoku(s);
		System.out.print(res);
	}
}
