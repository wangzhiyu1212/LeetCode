package leetcode;

public class SolveSudoku {
	char[][] board;
	int n = 9;
	int[][] rows = new int[n][n+1];
	int[][] columns = new int[n][n+1];
	int[][] boxes = new int[n][n+1];
	boolean sudokuSolved = false;
	public void placeNumber(int num,int i,int j) {
		int index = (i/3)*3+j/3;
		rows[i][num]++;
		columns[j][num]++;
		boxes[index][num]++;
		board[i][j] = (char)(num+'0');
	}
	public void removeNumber(int num,int i,int j) {
		int index = (i/3)*3+j/3;
		rows[i][num]--;
		columns[j][num]--;
		boxes[index][num]--;
		board[i][j] = '.';
	}
	public boolean couldPlace(int num, int row, int column) {
		int index = (row/3)*3+column/3;
		return rows[row][num] + columns[column][num] + boxes[index][num] == 0;
	}
	public void placeNextNumbers(int row, int column) {
		if (row == n-1 && column == n-1)
			sudokuSolved = true;
		else {
			if (column == n-1)
				backtrack(row+1,0);
			else
				backtrack(row,column+1);
		}
		  
	}
	public void backtrack(int row,int column) {
		if (board[row][column] == '.') {
			for (int i=1; i<10; i++) {
				if (couldPlace(i,row,column)) {
					placeNumber(i,row,column);
					placeNextNumbers(row,column);
					if(!sudokuSolved)
						removeNumber(i,row,column);
				}
			}
		} else
			placeNextNumbers(row,column);
	}
	public void solveSudoku(char[][] board) {
		this.board = board;
		for(int i=0; i<9; i++)
			for (int j=0; j<9; j++) {
				if (board[i][j] != '.') {
					int num = Character.getNumericValue(board[i][j]);
					placeNumber(num,i,j);
				}	
			}
		backtrack(0,0);
    }
}
