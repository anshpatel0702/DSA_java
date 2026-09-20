class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++){
            int val='z'-s.charAt(i)+1;
             sum=sum+val*(i+1);
        }
        return sum;
    }
}