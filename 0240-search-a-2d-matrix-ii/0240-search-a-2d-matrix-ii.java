class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int rowindex=0;
        int colindex=col-1;
        while(rowindex < row && colindex>=0){
            int ele=matrix[rowindex][colindex];
            if(ele==target){
                return true;
            }
            else if(ele<target){
                rowindex++;
            }
            else{ 
                colindex--;
            }
          }
       return false;
    }
}