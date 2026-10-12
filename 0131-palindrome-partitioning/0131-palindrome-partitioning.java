class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr=new ArrayList<>();
        solve(0,s,curr,ans);
        return ans;
    }
    public void solve(int ind,String s,List<String> curr,List<List<String>> ans ){
        if(ind==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<s.length();i++){
            String sub=s.substring(ind,i+1);
            if(palindrome(sub)){
                curr.add(sub);
                solve(i+1,s,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean palindrome(String st){
        int i=0;
        int j=st.length()-1;
        while(i<j){
            if(st.charAt(i++)!=st.charAt(j--)) return false;
        }
        return true;
    }
}