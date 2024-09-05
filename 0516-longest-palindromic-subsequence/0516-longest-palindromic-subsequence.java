class Solution {
    int[][] dp;
    public int Subseq(String s , int i , int j ){
        if(i == j ){
            return 1;
        }
        if(i >= j || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = 2+Subseq(s,i+1,j-1);
        }
        return dp[i][j] = Math.max(Subseq(s,i+1,j),Subseq(s,i,j-1));
    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        if(m == 1) return m;
        dp = new int[m+1][m+1];
        for(int i = 0 ; i<= m ; i++){
            for(int j = 0 ; j<= m ; j++){
                dp[i][j] = -1;
            }
        }
        return Subseq(s,0,m-1);
    }
}