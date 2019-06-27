package leetcode;

public class Rotate {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
        for (int j=0; j<len; j++)
        	for (int i=j; i<len; i++) {
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        for (int j=0; j<len/2; j++)
        	for (int i=0; i<len; i++) {
        		int index = len - j -1;
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[i][index];
        		matrix[i][index] = temp;
        	}
    }
}
/*
int[][] matrix = new int[][]{
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
Rotate t = new Rotate();
t.rotate(matrix);
for(int[] c:matrix)
System.out.println(Arrays.toString(c));
*/