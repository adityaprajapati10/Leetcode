class Solution {
    public int candy(int[] ratings) {
        int[] gift = new int[ratings.length];
        gift[0] = 1;
        for(int i = 1 ; i < ratings.length ; i++){
            if(ratings[i] > ratings[i-1]){
                gift[i] = gift[i-1] + 1;
            }else{
                gift[i] = 1;
            }
        }
        for(int i = ratings.length-2 ; i >= 0 ; i--){
            if(ratings[i] > ratings[i+1]){
                gift[i] = gift[i+1] + 1;
            }
        }
        int total = 0;
        for(int i : gift){
            total += i;
        }
        return total;
    }
}