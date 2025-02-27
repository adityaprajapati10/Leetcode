class Solution {
    public int solve(int[] arr, int j, int k, HashMap<Integer, Integer> map, int[][] dp){
        if(dp[j][k] != -1) return dp[j][k];
        int value = arr[k] - arr[j];
        if(map.containsKey(value) && map.get(value) < j){
            int i = map.get(value);
            return dp[j][k] = solve(arr, i, j, map, dp) + 1;
        }
        return dp[j][k] = 2;
    }
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        int[][] dp = new int[arr.length+1][arr.length+1];
        for(int i =0;i<arr.length+1;i++){
            for(int j =0;j<arr.length+1;j++){
                dp[i][j] = -1;
            }
        }
        int maxlength = 0;
        for(int j = 1; j<arr.length; j++){
            for(int k = j+1; k<arr.length; k++){
                int length = solve(arr, j, k, map, dp);
                if(length >= 3){
                    maxlength = Math.max(maxlength, length);
                }
            }
        }
        return maxlength >= 3 ? maxlength : 0;
    }
}