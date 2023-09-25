class Solution {
    public void nextPermutation(int[] nums) {
        int count1=-1;
        int count2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                count1=i;
                break;
            }
        }
        if(count1==-1){
            reverse(nums,0);
        }
        
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[count1]){
                    count2=i;
                    break;
                }
            }

            swap(nums,count1,count2);
            reverse(nums,count1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

