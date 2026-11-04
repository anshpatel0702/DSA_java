class Solution {
    public int findComplement(int num) {
        int temp=num;
        int i=0;
        while(temp!=0){
            num=num^(1<<i);
            i++;
            temp=temp>>1;
        }
        return num;
    }
}