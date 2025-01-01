class Solution {
    public int maxScore(String s) {
        int maxScore = 0 , count_zero = 0 , count_ones = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == '0') count_zero++;
            count_ones = 0;
            int j = i+1;
            while(j < s.length()){
                if(s.charAt(j) == '1') count_ones++;
                j++;
            }
            maxScore = Math.max(maxScore ,(count_ones + count_zero));
        }
        return maxScore;
    }
}