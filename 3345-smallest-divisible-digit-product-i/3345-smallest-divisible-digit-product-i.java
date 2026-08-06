class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int digit=1;
        int temp=n;
        while(temp>0){
            digit=digit*(temp%10);
            temp/=10;
        }
        if(digit % t ==0) return n;
        n++;
        }

    }
}