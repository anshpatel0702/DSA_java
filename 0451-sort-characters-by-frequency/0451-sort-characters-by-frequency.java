class Solution {
    public String frequencySort(String s) {
        int[] freq=new int [256];
        for(char ch:s.toCharArray()) freq[ch]++;
        StringBuilder[] sb=new StringBuilder[s.length()+1];
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                if(sb[freq[i]]==null){
                    sb[freq[i]]=new StringBuilder();
                }
                sb[freq[i]].append((char)i);
            }

        }
        StringBuilder ans=new StringBuilder();
        for(int i=s.length();i>=1;i--){
            if(sb[i]!=null){
                for(char ch: sb[i].toString().toCharArray()){
                    for(int j=0;j<i;j++){
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}