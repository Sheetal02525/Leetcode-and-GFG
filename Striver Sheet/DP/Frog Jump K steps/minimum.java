public class Solution {
    public static int minimizeCost(int n, int k, int []height){
        // Write your code here.
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int mini=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=dp[i-j]+Math.abs(height[i]-height[i-j]);
                    mini=Math.min(mini,jump);
                }
            }
            dp[i]=mini;
        }
        return dp[n-1];
    }
}
