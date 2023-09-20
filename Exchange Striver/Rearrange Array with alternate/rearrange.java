class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n];
        int[] neg=new int[n];
        int s=0;
        int h=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[s++]=nums[i];
            }
            else {
                neg[h++]=nums[i];
            }
        }
       s=0;
       h=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[s++];
            }
            else {
                nums[i]=neg[h++];
            }
        }
    
        return nums;

    }
}

