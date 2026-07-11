class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = (m*n) -1;

        while(low <= high) {
            int mid = (low + high)/2;

            int row = mid / n;
            int col = mid % n;

            int curr = matrix[row][col];

            if(curr == target) {
                return true;
            }
            if(curr < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
