class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        return (int)((pow(5,(n+1)/2)*pow(4,n/2))%MOD);
    }
    public long pow(long x ,long n){
        long ans =1;
        while(n>0){
            if(n%2==1){
                ans=(ans*x)%MOD;
                n--;
            }
            else{
                x=(x*x)%MOD;
                n=n/2;
            }
        }
      return ans;
    }
}