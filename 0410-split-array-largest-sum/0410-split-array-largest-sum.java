class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int x : nums){
            high+=x;
            low=Math.max(low,x);
        }
        while(low<=high){
           int mid=low+(high-low)/2;
           if(posible( nums, mid,k)){
               high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return low;
    }
    public boolean posible(int[] nums, int mid, int k){
        int arraysum=0; 
        int partition=1;
        for(int i=0;i< nums.length; i++){
            if(nums[i]+arraysum > mid){
                partition++;
                arraysum=nums[i];
            }
            else{
                arraysum+=nums[i];
            }
        }
        return partition <= k;
    }
}