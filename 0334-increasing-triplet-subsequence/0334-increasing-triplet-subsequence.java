class Solution {
    public boolean increasingTriplet(int[] nums) {
        int ptr1 = Integer.MAX_VALUE;
        int ptr2 = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= ptr1){
                ptr1 = i;
            }
            else if(i <= ptr2){
                ptr2 = i;
            }else{
                return true;
            }
        }
        return false;
    }
}