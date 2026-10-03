class Solution {
    public List<String> validStrings(int n) {
       StringBuilder sb=new StringBuilder();
       List<String> ans = new ArrayList<>();
        generate( n , sb,ans) ;
        return ans;
    }
    public void generate( int n, StringBuilder sb,List<String> ans){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }
       sb.append('1');
       generate(n,sb,ans);
       sb.deleteCharAt(sb.length()-1);
       if(sb.length()==0 || sb.charAt(sb.length()-1)!='0'){
        sb.append('0');
       generate(n,sb,ans);
       sb.deleteCharAt(sb.length()-1);
       }
    }
}