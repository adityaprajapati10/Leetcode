class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sumVal = 0;
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for(int i = 0; i<grid.length ; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                    sumVal += grid[i][j];
                }
                
            }
        }

        int n = grid.length*grid.length;
        int val = (n*(n+1))/2;

        ans[1] = val - sumVal;
        return ans;
    }
}