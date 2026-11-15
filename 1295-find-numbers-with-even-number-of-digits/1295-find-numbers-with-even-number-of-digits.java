class Solution {
    public int findNumbers(int[] nums) {
       int c=0;
       for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int ct=0;
        while(temp!=0){
            ct++;
            temp/=10;    
        }
        if((ct &1)==0) c=c+1;
       } 
       return c;
    }
}