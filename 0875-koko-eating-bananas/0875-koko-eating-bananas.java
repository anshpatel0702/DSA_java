class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Integer.MIN_VALUE;
        for(int pile : piles){
            e=Math.max(e,pile);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            long hour=0;
            for(int pile : piles){
                hour+=(pile+mid-1)/mid;
            }
            if(hour<=h){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}