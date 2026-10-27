class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count=0;
       int [] fre=new int[101];
       for(int a:nums){
        count+=fre[a];
        fre[a]++;
       }
   return count;
    }
}