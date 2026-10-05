class Solution {
    public int scoreOfParentheses(String s) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                c1++;
            }
           else {
                c1--;
                if(s.charAt(i-1)=='('){
                    c2=c2+(1<<c1);
                }
        }
        }
      return c2;
    }
}