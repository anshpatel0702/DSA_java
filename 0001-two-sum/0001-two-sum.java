class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
             int first=nums[i];
             int second=target-first;
            if(m.containsKey(second)){
                return new int[]{m.get(second),i};
            }
            else{
                m.put(first,i);
            }
        }
        return new int[] {-1,-1};

            
    }
}