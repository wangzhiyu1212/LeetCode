package leetcode;

import java.util.HashMap;

public class IsValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows = new HashMap[9];
        HashMap<Integer,Integer>[] colunms = new HashMap[9];
        HashMap<Integer,Integer>[] boxes = new HashMap[9];
        
        for (int i=0; i<9; i++) {
        	rows[i] = new HashMap<Integer,Integer>();
        	colunms[i] = new HashMap<Integer,Integer>();
        	boxes[i] = new HashMap<Integer,Integer>();
        }
        for (int i=0; i<9; i++) 
        	for (int j=0; j<9; j++) {
        		if (board[i][j] != '.') {
        			int num = (int)board[i][j];
        			rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
        			colunms[j].put(num, colunms[j].getOrDefault(num, 0) + 1);
        			int box_index = (i/3)*3 + j/3;
        			boxes[box_index].put(num, boxes[box_index].getOrDefault(num, 0) + 1);
        			
        			if(rows[i].get(num) > 1||colunms[j].get(num) > 1 ||boxes[box_index].get(num) > 1)
        				return false;
        		}
        	}
        return true;
    }
}
