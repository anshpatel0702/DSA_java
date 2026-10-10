class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        String[] ph={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder();
        solve(0,digits,ph,sb,ans);
        return ans;
    }
    public void solve(int ind, String digit, String[] ph, StringBuilder sb, List<String> ans){
        if(ind==digit.length()){
            ans.add(sb.toString());
            return;
        }
        String letter=ph[digit.charAt(ind)-'2'];
        for(int i=0; i<letter.length();i++){
            sb.append(letter.charAt(i));
            solve(ind+1,digit,ph,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}