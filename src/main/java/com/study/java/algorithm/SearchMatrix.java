package com.study.java.algorithm;

/**
 * 编写一个高效的算法来搜索 m * n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 * <p>
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * <p>
 * 示例 1：
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * 输出：true
 * <p>
 * 示例 2：
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
 * 输出：false
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= n, m <= 300
 * -10^9 <= matrix[i][j] <= 10^9
 * 每行的所有元素从左到右升序排列
 * 每列的所有元素从上到下升序排列
 * -109 <= target <= 109
 */
public class SearchMatrix {

    private static final int min = (int) Math.pow(-10,9);
    private static final int max = (int) Math.pow(10,9);

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (min > target || max < target) {
            return false;
        }

        int m = matrix.length;
        if (m > 300) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int n = matrix[i].length;
            if (n <= 0) {
                return false;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j] || max < matrix[i][j]) {

                    return false;
                }

                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 20));
    }
}
