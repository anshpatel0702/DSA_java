class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int min=Integer.MIN_VALUE;
        for(int a : weights){
            high+=a;
            min=Math.max(a,min);
        }
        while(min<=high){
            int mid=min+(high-min)/2;
            int nod=posible(weights,mid);
            if(nod<=days){
               high=mid-1;
            }
            else{
                min=mid+1;        
            }
        }
        return min;
    }

    public  static int posible(int [] weights, int capacity ){

        int day=1;
        int load=0;
        for(int i=0; i< weights.length;i++){
            if(weights[i]+load > capacity){
                load=weights[i];
                day++;
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
    }
