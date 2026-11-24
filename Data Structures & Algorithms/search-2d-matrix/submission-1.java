class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx=findRowIdx(matrix, target);
        if(rowIdx==-1){
            return false;
        }
        return findInRow(rowIdx, matrix, target);
    }
    public int findRowIdx(int[][] matrix, int target){
        int n=matrix[0].length;
        int m=matrix.length;
        int l=0;
        int r=m-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1]){
                return mid;
            }
            else if(target<matrix[mid][0]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public boolean findInRow(int rowIdx, int[][] matrix, int target){
         int n=matrix[0].length;
        int m=matrix.length;
        int l=0, r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(matrix[rowIdx][mid]==target){
                return true;
            }
            else if(target<matrix[rowIdx][mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}
