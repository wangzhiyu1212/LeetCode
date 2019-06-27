package leetcode;

public class UniquePathsWithObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid.length == 0) return 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] matrix = new int[m+1][n+1];
        matrix[0][1] = 1;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
            	if (obstacleGrid[i-1][j-1] == 1)
            		matrix[i][j] = 0;
            	else 
            		matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
        return matrix[m][n];
    }
}
/*
UniquePathsWithObstacles t = new UniquePathsWithObstacles();
int[][] matrix = new int[][]{
	{0, 1, 0},
	{0, 1, 0},
	{1, 0, 0}
	};
System.out.println(t.uniquePathsWithObstacles(matrix));
*/