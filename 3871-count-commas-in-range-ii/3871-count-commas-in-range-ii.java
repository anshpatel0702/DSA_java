class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
      long digit=1000;
      long ans=0;
      while(digit<=n){
        ans=ans+n-digit+1;
        digit*=1000;
      }
      return ans;
    }
}