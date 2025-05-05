class Solution {
    static int M = 1000000007;
    static int dp[] = new int[1001];
    public int numTilings(int n) {
        for(int i = 0; i<= n ; i++){
            dp[i] = -1;
        }
        return solveDp(n);
    }

    public static int solveDp(int n){
        if(n == 1 || n == 2){
            return n;
        }
        if(n == 3){
            return 5;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = (2 * solveDp(n-1) % M + solveDp(n-3) % M) % M;
        return dp[n];
    }
}