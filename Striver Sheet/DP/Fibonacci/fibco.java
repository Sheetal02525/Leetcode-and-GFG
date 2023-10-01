class Solution {
    public int fib(int n) {
    //     int[] dp=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     int count=fibo(dp,n);
    //     return count;
    // }
    // public static int fibo(int[] dp,int n){
    //     if(n<=1){
    //         return n;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     return dp[n]=fibo(dp,n-1)+fibo(dp,n-2);
    //    Tabulation with space complexity O(1)
        if(n<=1){
            return n;
        }
        int prev2=0;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int cur=prev1+prev2;
            prev2=prev1;
            prev1=cur;
        }
        return prev1;
    }
}
