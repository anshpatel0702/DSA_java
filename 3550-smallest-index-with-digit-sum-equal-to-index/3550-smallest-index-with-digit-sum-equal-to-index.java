class Solution {
    public int smallestIndex(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             int res=0;
             while(nums[i]>0){
                res+=nums[i]%10;
                 nums[i]= nums[i]/10;
             }
             if(res==i) return i;
        }
        return -1;
    }
}