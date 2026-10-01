class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int i=0;
        for(int y:set){
            nums[i++]=y;

        }
        return set.size();
    }
}