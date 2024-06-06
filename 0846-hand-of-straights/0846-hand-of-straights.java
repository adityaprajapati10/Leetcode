class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length > 2 && hand.length == groupSize) return false;
        return(hand.length % groupSize == 0 );
    }
}