class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=lowerbound(nums,target);
        if(first==n || nums[first]!=target) return new int[]{-1,-1};
        int last=upperbound(nums,target)-1;
        return new int[]{first,last};
    }
        private int lowerbound(int[] nums, int target){
            int s=0,e=nums.length-1;
            int ans=nums.length;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]>=target){
                    ans=mid;
                    e=mid-1;
                }
                else s=mid+1;
            
            }
            return ans;

        }
        private int upperbound(int[] nums, int target){
             int s=0,e=nums.length-1;
            int ans=nums.length;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]>target){
                    ans=mid;
                    e=mid-1;
                }
                else s=mid+1;
            
            }
            return ans;
        }
    }
