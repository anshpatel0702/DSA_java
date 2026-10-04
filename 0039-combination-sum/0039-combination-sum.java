class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve( 0,candidates,target,ans,list);
        return ans;
    }
    public void solve(int i, int[] arr, int target,List<List<Integer>> ans,  List<Integer> list){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=target){
            list.add(arr[i]);
           solve( i,arr,target-arr[i],ans,list); 
           list.remove(list.size()-1);
          
        }
         solve( i+1,arr,target,ans,list); 
    }
}