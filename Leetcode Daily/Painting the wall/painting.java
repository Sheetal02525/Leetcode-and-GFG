class Solution {
    Integer dp[][];int len = 501;
     public int paintWalls(int[] cost, int[] time) {
         dp = new Integer[cost.length][2*(len)];
         return find(0,0,cost,time);
     }
     public int find(int index,int occ,int cost[],int time[]){
         if(occ>=cost.length) return 0;
         if(index>=cost.length) {
             if(occ>=0) return 0;
             return Integer.MAX_VALUE/2;
         }
         if(dp[index][len + occ]!=null) return dp[index][len + occ];
         int ret = 0;
         ret = find(index+1,occ+time[index],cost,time) + cost[index]; // for paid worker
         ret = Math.min(ret,find(index+1,occ-1,cost,time)); //for free worker
         return dp[index][len + occ] = ret;
 }
 }