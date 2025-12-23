package Binary_Search;

// Search in 2D matrix II
// Leetcode 240
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.


// Input: matrix = [
//  [1,4,7,11,15],
//  [2,5,8,12,19],
//  [3,6,9,16,22],
//  [10,13,14,17,24],
//  [18,21,23,26,30]
// ], 
// target = 5
// Output: true


// if matrix[0][N] > target then col--; not will lie in that column due to col value increasing
//else if matrix[0][N] < target then row++ ;  not will lie in row 
public class problem7 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int Srow = 0;
        int Scol = n-1;
        while(Srow < m && Scol >= 0){
            if(target== matrix[Srow][Scol]){
                 return true;
            } else if(target>matrix[Srow][Scol]){
                Srow++;
            }else{
                 Scol--;
            }
        }
        return false;
    }
}
