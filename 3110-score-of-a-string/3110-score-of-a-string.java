class Solution {
    public int scoreOfString(String s) {
       char[] charr = s.toCharArray();
       int score = 0;
       for(int i = 0 ; i<charr.length-1 ; i++){
        score += Math.abs(charr[i] - charr[i+1]);
       } 
       return score;
    }
}