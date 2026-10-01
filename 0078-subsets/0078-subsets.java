class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans= new ArrayList<>();
       List<Integer> list= new ArrayList<>();
       solve(ans,list,0,nums);
       return ans; 
    }
    public void solve(List<List<Integer>> ans, List<Integer> list , int ind, int[] nums){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        solve(ans,list,ind+1,nums);
        list.remove(list.size()-1);
        solve(ans,list,ind+1,nums);
    }
}