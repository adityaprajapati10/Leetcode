class Solution {
    int m = 0 , n = 0;
    int dp[][] ;
    public int findSubseq(String s1 , String s2 , int i , int j){
        if(i >= m || j >= n){
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1+findSubseq(s1,s2,i+1,j+1);
        }
        else{
            return dp[i][j] = Math.max(findSubseq(s1,s2,i,j+1),findSubseq(s1,s2,i+1,j));
        }
    }
    public int minDistance(String word1, String word2) {
        m = word1.length();
        n = word2.length();
        dp = new int[m+1][n+1];
        for(int i = 0 ; i<= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                dp[i][j] = -1;
            }
        }
        int common = findSubseq(word1,word2,0,0);
        return m-common + n - common;
    }
}