class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] sum=new int[n];
        int add=0;
        for(int i=0;i<nums.length;i++){
            add=add+nums[i];
             sum[i]=add;
        }
        return sum;
    }
}