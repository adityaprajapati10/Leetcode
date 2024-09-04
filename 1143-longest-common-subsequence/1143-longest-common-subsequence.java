class Solution {
    int m , n;
    int[][] dp ;
    public int findSubsequence(String s1 , String s2 , int i , int j ){
        if(i >= m || j >= n){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1+findSubsequence(s1,s2,i+1,j+1);
        }else{
            return dp[i][j] = Math.max(findSubsequence(s1,s2,i,j+1),findSubsequence(s1,s2,i+1,j));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        m = text1.length();
        n = text2.length();
        dp = new int[m+1][n+1];
        for(int i = 0 ; i<=m ; i++){
            for(int j = 0 ; j<=n ;j++){
                dp[i][j] = -1;
            }
        }
        return findSubsequence(text1, text2, 0 , 0);
    }
}