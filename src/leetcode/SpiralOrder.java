package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	List<Integer> out = new ArrayList<Integer>();	
	public void spiral(int[][] matrix, int top, int bottom, int left, int right) {
		if (top > bottom || left > right)
			return;
		if (top == bottom) {
			for (int i=left; i<=right; i++)
				out.add(matrix[top][i]);
			return;
		}
		if (left == right) {
			for (int i=top; i<= bottom; i++)
				out.add(matrix[i][left]);
			return;
		}
		for (int i=left; i<=right; i++)
			out.add(matrix[top][i]);
		for (int i=top+1; i<=bottom; i++)
			out.add(matrix[i][right]);
		for (int i=right-1; i>=left; i--)
			out.add(matrix[bottom][i]);
		for (int i=bottom-1; i>=top+1; i--)
			out.add(matrix[i][left]);
		spiral(matrix,top+1,bottom-1,left+1,right-1);			
	}
	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix.length == 0) return out;
        spiral(matrix, 0, matrix.length-1, 0, matrix[0].length-1);
        return out;
    }
}
/*
int[][] matrix = new int[][]{
	{1, 2, 3},
	{4, 5, 6},
	{7, 8, 9}
	};
SpiralOrder t = new SpiralOrder();
System.out.println(t.spiralOrder(matrix).toString());
*/