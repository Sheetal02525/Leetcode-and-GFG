class Solution {
    public int findPeakElement(int[] nums) {
      int n=nums.length-1;
      if(nums[n-1]>nums[n-2]){
          return n-1;
      }
      if(n==1 || nums[0]>nums[1]){
          return 0;
      }
      int s=0;
      int e=nums.length-1;
      while(s<=e){
          int m=s+(e-s)/2;
          int prev=m==0?Integer.MIN_VALUE:nums[m-1];
          int next=m==n-1?Integer.MAX_VALUE:nums[m+1];
          if(nums[m]>prev && nums[m]>next){
              return m;
          }
          else if(nums[m]>prev){
              s=m+1;
          }
          else {
              e=m-1;
          }
      }
      return s;

    }
}
