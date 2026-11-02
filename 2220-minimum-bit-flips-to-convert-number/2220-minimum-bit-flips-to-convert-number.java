class Solution {
    public int minBitFlips(int start, int goal) {
        int i=start^goal;
        int c=0;
        while(i!=0){
            i=i&(i-1);
            c++;
        }
        return c;
    }
}