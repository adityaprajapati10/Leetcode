class Solution {
    public static boolean check(int[][] grid , int n , int m){
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[n + i][m + j];
                if (num < 1 || num > 9 || st.contains(num)) {
                    return false;
                } else {
                    st.add(num);
                }
            }
        }
        int d1 = grid[n][m] + grid[n+1][m+1] + grid[n+2][m+2];
        int d2 = grid[n][m+2] + grid[n+1][m+1] + grid[n+2][m];
        if(d1 != d2 ){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            int rowSum = grid[n + i][m] + grid[n + i][m + 1] + grid[n + i][m + 2];

            if (rowSum != d1) {
                return false;
            }
        }
        for (int j = 0; j < 3; j++) {
            int colSum = grid[n][m + j] + grid[n + 1][m + j] + grid[n + 2][m + j];
            if (colSum != d1) {
                return false;
            }
        }
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length >= 3){
            int count = 0;
            int n = grid.length - 3 ;
            for(int i = 0 ; i<= n ; i++){
                for(int j = 0 ;j<= n ; j++){
                    if(check(grid , i , j)){
                        count++;
                    }
                }
            }
            return count;
        }
        else{
            return 0;
        }
    }
}