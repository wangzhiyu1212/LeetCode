package leetcode;

import java.util.Arrays;

public class CodeTest {

	public static void main(String[] args) {
		char[][] board = new char[][]{
            {'.', '.', '5', '7', '.', '.', '.', '9', '.'},
            {'.', '.', '.', '.', '.', '1', '.', '8', '.'},
            {'3', '.', '.', '.', '8', '.', '.', '.', '6'},
            {'.', '2', '.', '5', '.', '.', '.', '.', '.'},
            {'.', '3', '.', '.', '2', '.', '.', '.', '.'},
            {'6', '4', '.', '.', '.', '.', '.', '7', '.'},
            {'4', '9', '.', '.', '.', '.', '.', '.', '3'},
            {'.', '.', '8', '.', '.', '9', '.', '5', '.'},
            {'.', '.', '.', '.', '.', '.', '1', '.', '.'}
		};
		SolveSudoku s = new SolveSudoku();
		s.solveSudoku(board);
		for(char[] c:board)
			System.out.println(Arrays.toString(c));
	}
}
