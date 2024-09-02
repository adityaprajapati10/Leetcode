class Solution {
    public int solve(int[][] grid , int i , int j , int m , int n , int[][] temp){
        if(i == m-1 && j == n-1){
            return grid[i][j];
        }
        if(temp[i][j] != -1){
            return temp[i][j];
        }
        if(i == m-1){
            temp[i][j] = grid[i][j] + solve(grid , i , j+1 , m , n , temp);
            return temp[i][j];
        }
        else if(j == n-1){
            temp[i][j] = grid[i][j] + solve(grid , i+1 , j , m , n , temp);
            return temp[i][j];
        }
        else{
            temp[i][j] = grid[i][j] + Math.min(solve(grid , i , j+1 , m , n , temp) , solve(grid , i+1 , j , m , n , temp));
            return temp[i][j];
        }
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m+1][n+1];
        for(int i = 0 ; i<temp.length ; i++){
            for(int j = 0 ; j<temp[0].length ; j++){
                temp[i][j] = -1;
            }
        }
        return solve(grid , 0 , 0 , m , n , temp);
    }
}