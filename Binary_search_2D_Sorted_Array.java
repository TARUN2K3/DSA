public class Binary_search_2D_Sorted_Array {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return searchMatrix(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    private boolean searchMatrix(int[][] matrix, int target, int rowStart, int rowEnd, int colStart, int colEnd) {
        if (rowStart > rowEnd || colStart > colEnd) {
            return false;
        }

        int rowMid = rowStart + (rowEnd - rowStart) / 2;
        int colMid = colStart + (colEnd - colStart) / 2;
        int pivot = matrix[rowMid][colMid];

        if (pivot == target) {
            return true;
        }

        if (target < pivot) {
            
            return searchMatrix(matrix, target, rowStart, rowMid - 1, colStart, colEnd) ||
                   searchMatrix(matrix, target, rowMid, rowEnd, colStart, colMid - 1);
        } else {
            
            return searchMatrix(matrix, target, rowMid + 1, rowEnd, colMid + 1, colEnd) ||
                   searchMatrix(matrix, target, rowMid + 1, rowEnd, colStart, colMid) ||
                   searchMatrix(matrix, target, rowStart, rowMid, colMid + 1, colEnd);
        }
    }

    public static void main(String[] args) {
        Binary_search_2D_Sorted_Array solution = new Binary_search_2D_Sorted_Array();
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        System.out.println(solution.searchMatrix(matrix, target)); 
        target = 20;
        System.out.println(solution.searchMatrix(matrix, target)); 
    }
}
