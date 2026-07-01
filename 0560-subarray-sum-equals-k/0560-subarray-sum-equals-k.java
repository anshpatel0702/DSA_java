class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        for(int i=0; i<n;i++){
            presum+=nums[i];
            int x=presum-k;
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}