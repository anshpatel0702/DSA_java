class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean sign=true;
        if(dividend >=0 && divisor < 0 ) sign=false;
       else if(dividend <=0 && divisor > 0 ) sign=false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d){
           int c=0;
           while(n>=(d<<(c+1))){
             c+=1;
           }
           ans+=(1L<<c);
           n=n-(d<<c);
        }
        if(!sign) ans=-ans;
        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)ans;

    }
}