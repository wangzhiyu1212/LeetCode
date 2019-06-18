package leetcode;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m*n - 1;
        while (left < right) {
        	int mid = (left + right)/2;
        	int row = mid/n;
        	int col = mid%n;
        	if (matrix[row][col] < target)
        		left = mid + 1;
        	else if (matrix[row][col] > target)
        		right = mid;
        	else
        		return true;
        }
        int mid = (left + right)/2;
    	int row = mid/n;
    	int col = mid%n;
    	if (matrix[row][col] == target)
    		return true;
    	else return false;
    }
}
