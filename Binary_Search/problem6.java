package Binary_Search;

// Search in 2D Matrix

// method 1: brute force O(m*n)
// method 2: one for loop for row , check in which row, target lie in between starting and ending and then do binary search of that row only O(mlogn) 
// flatten 2D int 1D method 3 : 
//   row = index(1D) / columns    col = index(1D) % columns
// array will became = m*n length 
// Method 4: Kunal Kamara

public class problem6 {
       // Method 2
        public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int Srow=0;
        for(int i=0;i<m;i++){
            if(target>=matrix[i][Srow] && target<=matrix[i][n-1]){
                return binary(i,Srow,n-1,target,matrix);
            }
        }
        return false;
    }
    public static boolean binary(int row , int start , int end , int target,int[][]arr){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[row][mid]==target)
             return true;
            else if(arr[row][mid]>target)
              end =mid-1;
            else
            start =mid+1;
        }
        return false;
    }

    // Method 3: falten 2d to 1D
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int end = m*n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int row = mid/n;
            int col = mid%n;
            if(target == matrix[row][col]){
                return true;
            } else if(target>matrix[row][col]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    // Method 4

}
