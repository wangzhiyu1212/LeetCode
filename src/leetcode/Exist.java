package leetcode;

public class Exist {
	boolean isExist = false;
	char[][] board;
	int[][] check;
	String word;
	public void backtrack(int i, int j, int index) {
		if (index == word.length()) {
			isExist = true;
			return;
		}
		check[i][j] = 1;
		if (j > 0 && board[i][j-1] == word.charAt(index) && check[i][j-1] == 0 && !isExist) 
			backtrack(i, j-1, index+1);
		if (j < board[0].length - 1 && board[i][j+1] == word.charAt(index) && check[i][j+1] == 0 && !isExist)
			backtrack(i, j+1, index+1);
		if (i > 0 && board[i-1][j] == word.charAt(index) && check[i-1][j] == 0 && !isExist) 
			backtrack(i-1, j, index+1);
		if (i < board.length - 1 && board[i+1][j] == word.charAt(index) && check[i+1][j] == 0 && !isExist)
			backtrack(i+1, j, index+1);
		check[i][j] = 0;
	}
	public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return false;
        if (board.length == 0) return false;
        this.board = board;
        this.word = word;
        check = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
        	for (int j = 0; j < board[0].length; j++) {
        		if (board[i][j] == word.charAt(0)) {
        			backtrack(i, j, 1);
        		}
        	}
        return isExist;
    }
}
/*
Exist t = new Exist();
char[][] board = new char[][] {
	{'A','B','C','E'},
	{'S','F','E','S'},
	{'A','D','E','E'}
	};
System.out.println(t.exist(board, "ABCESEEEFS"));
*/