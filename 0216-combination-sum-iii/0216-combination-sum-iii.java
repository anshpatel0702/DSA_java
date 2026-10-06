class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
     List<List<Integer>> ans=new ArrayList<>();
     List<Integer> list=new ArrayList<>();
     solve(1,k,n,ans,list);
     return ans;   
    }
    public void solve(int ind,int k,int n,List<List<Integer>> ans,List<Integer> list){
        if(k==list.size()){
            if(n==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=ind;i<=9;i++){
            if(i>n) break;
            list.add(i);
            solve(i+1,k,n-i,ans,list);
            list.remove(list.size()-1);
        }
    }
}