class Solution {
    public int maxScore(String s) {
        int maxScore = 0 , countZeros = 0 , countOnes = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                countOnes++;
            }
        }
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == '0'){
                countZeros++;
            } else{
                countOnes--;
            }
            maxScore = Math.max(maxScore, countOnes+countZeros);
        }
        return maxScore;
    }
}