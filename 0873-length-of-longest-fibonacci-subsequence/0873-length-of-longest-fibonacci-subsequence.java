class Solution {
    public int solve(int[] arr, int j, int k, HashMap<Integer, Integer> map){
        int value = arr[k] - arr[j];
        if(map.containsKey(value) && map.get(value) < j){
            int i = map.get(value);
            return solve(arr, i, j, map) + 1;
        }
        return 2;
    }
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        int maxlength = 0;
        for(int j = 1; j<arr.length; j++){
            for(int k = j+1; k<arr.length; k++){
                int length = solve(arr, j, k, map);
                if(length >= 3){
                    maxlength = Math.max(maxlength, length);
                }
            }
        }
        return maxlength >= 3 ? maxlength : 0;
    }
}