class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE) return 0;
        long m=n;
        if(m<0) m=-m;
        while(m>0){
            if(m%2==1){
                ans=ans*x;
                m--;
            }
            else{
                m=m/2;
                x=x*x;
            }
        }
        if(n<0) ans=1.0/ans;
        return ans;
        
    }
}