class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = (n+rolls.length)*mean;
        for(int i : rolls){
            sum -= i;
        }
        if(sum > 6*n || sum < n) return new int[0];
        int[] res = new int[n];
        int val = sum/n;
        for(int i = 0 ; i<n ; i++){
            res[i] = val;
        }
        int mod = sum%n;
        for(int i = 0 ; i<mod ; i++){
            res[i]++;
        }
        return res;
    }
}