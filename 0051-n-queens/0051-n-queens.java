class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] r : board){
            Arrays.fill(r,'.');
        }
        int[] leftrow=new int[n];
        int[] upperdia=new int[2*n-1];
        int[] lowerdia=new int[2*n-1];
        solve(0,board,ans,leftrow,upperdia,lowerdia,n);
        return ans;
    }
       public void solve(int c, char[][] board,List<List<String>> ans, int[] leftrow,int [] upperdia, int[] lowerdia, int n){
        if( c==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
              temp.add(new String(board[i]));

         }
         ans.add(temp);
         return;
        }
        for(int r=0;r<n;r++){
            if(leftrow[r]==0 && lowerdia[r+c]==0 && upperdia[n-1+c-r]==0){
                board[r][c]='Q';
                leftrow[r]=1;
                lowerdia[r+c]=1;
                upperdia[n-1+c-r]=1;
                solve(c+1,board,ans,leftrow,upperdia,lowerdia,n);
                board[r][c]='.';
                leftrow[r]=0;
                lowerdia[r+c]=0;
                upperdia[n-1+c-r]=0;

            }
        }
       } 
       
    }
