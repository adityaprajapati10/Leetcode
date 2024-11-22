class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int maxCount = 0;
        int n = matrix[0].length;
        for(int currRow[] : matrix){
            int inverted[] = new int[n];
            int count = 0;
            for(int col = 0 ; col < n ; col++){
                inverted[col] = currRow[col] == 0 ? 1 : 0;
            }
            for(int row[] : matrix){
                if(Arrays.equals(currRow,row) || Arrays.equals(row, inverted)){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}