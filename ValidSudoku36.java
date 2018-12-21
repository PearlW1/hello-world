// two methods for this question
//https://leetcode.com/problems/valid-sudoku/

import java.util.HashSet;

public class ValidSudoku36 {
	public void ValidSudoku36() { };

	public boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < 9; i++){
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> cols = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();

			for(int j = 0; j < 9; j++){
				//1-9 .
				if(board[i][j] != '.' && !rows.add(board[i][j])){
					return false;
				}
				if(board[i][j] != '.' && !cols.add(board[i][j])){
					return false;
				}
				int rowIdx = 3*(i/3);
				int colIdx = 3*(j%3);
				if(board[rowIdx + j/3][colIdx + j%3] != '.' && !cube.add(board[rowIdx + j/3][colIdx + j%3])){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args){

	    long startTimestamp = System.currentTimeMillis();
		char[][] board = new char[][]{
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
				};
		ValidSudoku36 obj = new ValidSudoku36();
		System.out.print(obj.isValidSudoku(board));

      long endTimestamp = System.currentTimeMillis();
		long time = endTimestamp - startTimestamp;
		System.out.print(time);
	}
}


//优化

//import java.util.HashSet;
//
//public class ValidSudoku36 {
//	public void ValidSudoku36() { };
//
//	public boolean isValidSudoku(char[][] board) {
//		HashSet<Character> rows = new HashSet<Character>();
//		HashSet<Character> cols = new HashSet<Character>();
//		HashSet<Character> cube = new HashSet<Character>();
//
//		for (int i = 0; i < 9; i++){
//			for(int j = 0; j < 9; j++){
//				//1-9 .
//				if(board[i][j] != '.' && !rows.add(board[i][j])){
//					return false;
//				}
//				if(board[i][j] != '.' && !cols.add(board[i][j])){
//					return false;
//				}
//				int rowIdx = 3*(i/3);
//				int colIdx = 3*(j%3);
//				if(board[rowIdx + j/3][colIdx + j%3] != '.' && !cube.add(board[rowIdx + j/3][colIdx + j%3])){
//					return false;
//				}
//			}
//			rows.clear();
//			cols.clear();
//			cube.clear();
//		}
//		return true;
//	}
//
//	public static void main(String[] args){
//		long startTimestamp = System.currentTimeMillis();
//		char[][] board = new char[][]{
//				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//		};
//		ValidSudoku36 obj = new ValidSudoku36();
//		System.out.print(obj.isValidSudoku(board));
//		long endTimestamp = System.currentTimeMillis();
//		long time = endTimestamp - startTimestamp;
//		System.out.print(time);
//
//	}
//}