class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int idx = 0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(idx < original.length){
                    ans[i][j] = original[idx++];
                }
                else{
                    return new int[0][0];
                }
            }
        }
        if(idx == original.length) return ans;
        return new int[0][0];
    }
}