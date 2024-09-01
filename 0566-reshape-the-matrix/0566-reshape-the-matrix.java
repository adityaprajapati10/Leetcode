class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length)
            return mat;
        int[][] ans = new int[r][c];
        int m = 0;
        int n = 0;
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                ans[i][j] = mat[m][n];  
                n++;  
                if (n == mat[0].length) {  
                    n = 0;  
                    m++;  
                }  
            }
        }
        return ans;
    }
}