class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int ans[] = new int[2];
        for(int row = 0 ; row < mat.length ; row++){
            int c = 0;
            for(int i  =0 ; i< mat[row].length ; i++){
                if(mat[row][i] == 1) c++;
            }
            if(c > count){
                ans[0] = row;
                ans[1] = c;
                count = c;
            }
        }
        return ans;
    }
}