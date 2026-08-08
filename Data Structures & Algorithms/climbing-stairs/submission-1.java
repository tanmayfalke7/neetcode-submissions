class Solution {

    public int func(int n,int[] dp){
        if(n<=1) return dp[n];
        if(dp[n]!=0) return dp[n];
        return dp[n]=func(n-1,dp)+func(n-2,dp);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        dp[1]=1;
        return func(n,dp);
    }
}
