class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] arr=new int[2];
    int s=0;
    int e=nums.length-1;
    arr[0]=first(nums,s,e,target);
    arr[1]=last(nums,s,e,target);
    return arr;
    }
    public int first(int[] nums,int s,int e,int target){
        int res=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                res=m;
                e=m-1;
            }
            else if(nums[m]>target){
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return res;
    }

     public int last(int[] nums,int s,int e,int target){
        int res=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                res=m;
                s=m+1;
            }
            else if(nums[m]>target){
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return res;
    }
}