package leetcode;

import java.util.Arrays;

public class SetZeroes {
	public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] column = new int[n];
        for (int i = 0; i < m; i++)
        	for (int j = 0; j < n; j++) {
        		if (matrix[i][j] == 0) {
        			column[j] = 1;
        			row[i] = 1;
        		}
        	}
        for (int i = 0; i < m; i++) {
        	if (row[i] == 1)
        		for (int j = 0; j < n; j++)
        			matrix[i][j] = 0;
        }
        for (int j = 0; j < n; j++)
        	if (column[j] == 1)
        		for (int i = 0; i < m; i++)
        			matrix[i][j] = 0;
    }
}
/*
int[][] matrix = new int[][]{
{0, 1, 2, 0},
{3, 4, 5, 2},
{1, 3, 1, 5}
};
SetZeroes t = new SetZeroes();
t.setZeroes(matrix);
for(int[] c:matrix)
System.out.println(Arrays.toString(c));
*/