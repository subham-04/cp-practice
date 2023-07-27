
class Solution{
    static int maxSum(int N, int mat[][])
    {
        // code here
        int[] dp = new int[N];
        
        dp[0]=Math.max(mat[0][0],mat[1][0]);
        dp[1]=Math.max(Math.max(mat[0][0],mat[1][0]), Math.max(mat[0][1],mat[1][1]));
        
        for(int i=2; i<N; i++){
            dp[i]=Math.max(dp[i-1],Math.max(mat[0][i]+dp[i-2],mat[1][i]+dp[i-2]));
        }
        
        return dp[N-1];
    }
}