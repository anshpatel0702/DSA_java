class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        int temp=n;
        while(temp>0){
            pro=pro*(temp%10);
            temp=temp/10;
     }
     temp=n;
     while(temp>0){
        sum=sum+(temp%10);
       temp=temp/10;
     }
     return pro-sum;
    }
}