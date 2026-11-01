class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")) --x;
            else if(operations[i].equals("X--")) x--;
            else if(operations[i].equals("++X")) ++x;
            else if(operations[i].equals(++x)) ++x;
        }
        return x;
    }
}