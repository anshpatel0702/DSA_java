class Solution { 
    private boolean posible(int[] nums, int threshold, int mid){
        int sum=0;
        for(int a: nums){
            sum+=(a+mid-1)/mid;
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=Integer.MIN_VALUE;
        int ans=-1;
        for(int a: nums){
            e=Math.max(e,a);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(posible(nums,threshold,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}