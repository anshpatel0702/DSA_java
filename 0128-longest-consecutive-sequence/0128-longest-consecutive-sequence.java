class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> arr=new HashSet<>();
        for(int a:nums){
            arr.add(a);
        }
        for(int a: arr){
            if(!arr.contains(a-1)){
                int count=1;
                int x=a;
                while(arr.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
            
        }
        return longest;
        
    }
}