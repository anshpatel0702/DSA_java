class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int end=n-1;
        int carry=1;
        while(end >=0 ){
           int sum = digits[end]+carry;
           digits[end]=sum%10;
           carry=sum/10;  
           if(carry==0)return digits; 
           end--;    
        }
          int[] ans=new int[n+1];
          ans[0]=carry;
        return ans;
    }
}