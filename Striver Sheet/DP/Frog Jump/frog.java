import java.util.* ;


import java.io.*; 
class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
      
    //   int[] dp=new int[n+1];
    //   Arrays.fill(dp,-1);
    //   int count=jump(n-1,heights,dp);
    //   return count;
    // }
    // public static int jump(int ind,int[] heights,int[] dp){
    //     if(ind==0) return 0;
    //     if(dp[ind]!=-1) return dp[ind];
    //     int left=jump(ind-1,heights,dp)+Math.abs(heights[ind]-heights[ind-1]);
    //     int right=Integer.MAX_VALUE;
    //     if(ind>1){
    //         right=jump(ind-2,heights,dp)+Math.abs(heights[ind]-heights[ind-2]);
    //     }
    //     return dp[ind]=Math.min(left,right);

    // Tabulation

    // int[] dp=new int[n];
    // dp[0]=0;
    // for(int i=1;i<n;i++){
    //     int first=dp[i-1]+Math.abs(heights[i-1]-heights[i]);
    //     int secound=Integer.MAX_VALUE;
    //     if(i>1){
    //         secound=dp[i-2]+Math.abs(heights[i-2]-heights[i]);
    //     }

    //     dp[i]=Math.min(first,secound);

    // }
    // return dp[n-1];
    // Tabulation with Space Complexity O(1)
    int prev1=0;
    int prev2=0;
    for(int i=1;i<n;i++){
        int first=prev1+Math.abs(heights[i-1]-heights[i]);
        int secound=Integer.MAX_VALUE;
        if(i>1){
            secound=prev2+Math.abs(heights[i-2]-heights[i]);
        }
        int cur=Math.min(first,secound);
        prev2=prev1;
        prev1=cur;
    }
    return prev1;
    }

}