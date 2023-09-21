import java.util.*;
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            map.put(sum,i);
        }
        if(sum<x){
            return -1;
        }
        int target=sum-x;
        int max=Integer.MIN_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-target)){
                int maxi=i-map.get(sum-target);
                max=Math.max(max,maxi);
            }
        }
        return max==Integer.MIN_VALUE?-1:n-max;
    }
}
