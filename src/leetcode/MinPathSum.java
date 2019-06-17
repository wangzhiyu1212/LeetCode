package leetcode;

public class MinPathSum {
	public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length;
		int n = grid[0].length;
		int[][] matrix = new int[m][n];
		matrix[0][0] = grid[0][0];
		for (int i=1; i<m; i++)
			matrix[i][0] = matrix[i-1][0] + grid[i][0];
		for (int j=1; j<n; j++)
			matrix[0][j] = matrix[0][j-1] + grid[0][j];
		for (int i=1; i<m; i++)
			for(int j=1; j<n; j++) {
				matrix[i][j] = grid[i][j] + Math.min(matrix[i-1][j], matrix[i][j-1]);
			}
		
		return matrix[m-1][n-1];
    }
}
/**
MinPathSum t = new MinPathSum();
		int[][] matrix = new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			};
		System.out.println(t.minPathSum(matrix));
		*/
