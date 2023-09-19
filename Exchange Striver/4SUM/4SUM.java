import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
        Set<List<Integer>> ll=new HashSet<>();
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int low=j+1;
                int high=nums.length-1;
                while(low<high){
                    long sum=(long)nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum==target){
                        ll.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                    }
                    else if(sum<target){
                        low++;
                    }
                    else {
                        high--;
                    }
                }
            }
        }
        return new ArrayList<>(ll);
   
        
    }
}