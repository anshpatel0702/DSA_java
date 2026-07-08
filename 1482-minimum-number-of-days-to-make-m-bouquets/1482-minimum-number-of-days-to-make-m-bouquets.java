class Solution {
    private boolean posible(int[] bloomDay,int m,int k,int mid){
        int count=0;
        int bouquet=0;
       for(int bloom : bloomDay){
        if(bloom<=mid){
            count++;
        }
        else{
            bouquet+=count/k;
            count=0;
        }
       }
        bouquet+=count/k;
        return bouquet>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long r=(long)m*k;
        if(r>bloomDay.length) return -1;
        int result=0;
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int a : bloomDay){
            s=Math.min(a,s);
            e=Math.max(a,e);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(posible(bloomDay,m,k,mid)){
                  result=mid;
                  e=mid-1;
            }
            else s=mid+1;
        }
        return result;
    }
}