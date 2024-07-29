class Solution {
    public int numTeams(int[] rating) {
        int total = 0;
        for(int j = 1 ; j<rating.length ; j++){
            int smallLeft = 0;
            int largeRight = 0;
            int largeLeft = 0;
            int smallRight = 0;
            for(int i = 0 ; i < j ; i++){
                if(rating[i] < rating[j]){
                    smallLeft++;
                }
                if(rating[i] > rating[j]){
                    largeLeft++;
                }
            }
            for(int k = j+1 ; k < rating.length ; k++){
                if(rating[k] > rating[j]){
                    largeRight++;
                }
                if(rating[k] < rating[j]){
                    smallRight++;
                }
            }
            total += (smallLeft * largeRight) + (largeLeft * smallRight);
        }
        return total;
    }
}