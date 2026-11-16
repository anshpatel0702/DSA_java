class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            String con=String.valueOf(nums[l]) + String.valueOf(nums[r]);
            ans=ans+Integer.parseInt(con);
            l++;
            r--;
        }
        if(l==r) ans+=nums[l];
        return ans;
  }
}