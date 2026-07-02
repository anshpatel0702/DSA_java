class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1; el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2=1; el2=nums[i];
            }
            else if(el1==nums[i]) cnt1++;
            else if(el2==nums[i]) cnt2++;
            else{
                cnt1--;cnt2--;
            }            
        }
        cnt1=0;
        cnt2=0;
        for(int a: nums){
             if (a == el1) cnt1++; 
            if (a == el2) cnt2++;

        }
        int min=nums.length/3 + 1;
        List<Integer> result = new ArrayList<>();
        if(cnt1>=min) result.add(el1);
        if(cnt2>=min&& el1!=el2) result.add(el2);
        return result;
    }
}